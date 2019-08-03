package Multithreading;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo implements Callable<String>{
	@Override
	public String call() throws Exception {
		Thread.sleep(100);
		return Thread.currentThread().getName();
	
	}
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		List<Future<String>> list = new ArrayList<Future<String>>();
		
		CallableFutureDemo cal = new CallableFutureDemo();
		for(int i=0; i< 100; i++){
			Future<String> future = es.submit(cal);
			list.add(future);
		}
		for(Future<String> fut : list)
		{
			try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println(new Date()+ "::"+fut.get());
            } catch (InterruptedException  e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		es.shutdown();
	}

}
