package Multithreading;

/*
 * http://tutorials.jenkov.com/java-multithreaded-servers/singlethreaded-server.html
 * When the server is running you can access it using an ordinary web browser. 
 * Use the address http://localhost:9000/
 */

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class SingleThreadedServer1 implements Runnable{
	protected int          serverPort   = 8080;
    protected ServerSocket serverSocket = null;
    protected boolean      isStopped    = false;
    protected Thread       runningThread= null;
    
    public SingleThreadedServer1(int port){
        this.serverPort = port;
    }
    
    public void run(){
        synchronized(this){
            this.runningThread = Thread.currentThread();
        }
        openServerSocket();
        while(! isStopped()){
            Socket clientSocket = null;
            try {
                clientSocket = this.serverSocket.accept();
            } catch (IOException e) {
                if(isStopped()) {
                    System.out.println("Server Stopped.") ;
                    return;
                }
                throw new RuntimeException(
                    "Error accepting client connection", e);
            }
            try {
                processClientRequest(clientSocket);
            } catch (Exception e) {
                //log exception and go on to next request.
            }
        }
        System.out.println("Server Stopped.");
    }
    private void processClientRequest(Socket clientSocket)
    	    throws Exception {
    	        InputStream  input  = clientSocket.getInputStream();
    	        OutputStream output = clientSocket.getOutputStream();
    	        long time = System.currentTimeMillis();

    	        byte[] responseDocument = ("<html><body>"+"Singlethreaded Server:"+time +"</body></html>").getBytes("UTF-8");

    	        byte[] responseHeader =("HTTP/1.1 200 OK\r\n" +"Content-Type: text/html; charset=UTF-8\r\n" +"Content-Length: " + responseDocument.length +"\r\n\r\n").getBytes("UTF-8");

    	        output.write(responseHeader);
    	        output.write(responseDocument);
    	        output.close();
    	        input.close();
    	        System.out.println("Request processed: " + time);
    	    }

    	    private synchronized boolean isStopped() {
    	        return this.isStopped;
    	    }

    	    public synchronized void stop(){
    	        this.isStopped = true;
    	        try {
    	            this.serverSocket.close();
    	        } catch (IOException e) {
    	            throw new RuntimeException("Error closing server", e);
    	        }
    	    }

    	    private void openServerSocket() {
    	        try {
    	            this.serverSocket = new ServerSocket(this.serverPort);
    	        } catch (IOException e) {
    	            throw new RuntimeException("Cannot open port 8080", e);
    	        }
    	    }
}

public class SingleThreadedServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThreadedServer1 server = new SingleThreadedServer1(9000);
		new Thread(server).start();

		try {
		    Thread.sleep(100 * 1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();  
		}
		System.out.println("Stopping Server");
		server.stop();
	}

}