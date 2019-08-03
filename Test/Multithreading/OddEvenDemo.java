package Multithreading;
class Thread1 implements Runnable {

    private static boolean evenFlag = true;

    public synchronized void run() {
        if (evenFlag == true) {
            printEven();
        } else {
           printOdd();
        }
    }

    public void printEven() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i+""+Thread.currentThread());
        }
        evenFlag = false;
    }

    public  void printOdd() {
        for (int i = 1; i <= 11; i += 2) {
            System.out.println(i+""+Thread.currentThread());
        }
        evenFlag = true;
    }
}
public class OddEvenDemo {

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread td1 = new Thread(t1);
        Thread td2 = new Thread(t1);
        td1.start();
        td2.start();

    }
}