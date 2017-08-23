
/* This code is to create a code using Runnable */
class MyThread implements Runnable {
   private Thread t;

   public MyThread( String name){
       t=new Thread(this,name);
       t.start();
       System.out.println("Creating " +  t );
   }
   public void run() {
      try {
         for(int i = 1; i <=5; i++) {
            System.out.println("Thread: " + t.getName() + ": value: " + i);
            Thread.sleep(50);
         }
     } catch (InterruptedException e) {
     }
     System.out.println("Thread " +  t.getName() + " exiting.");
   }
}

public class Main {
   public static void main(String args[]) {

      MyThread t1=new MyThread("Thread1");
      MyThread t2=new MyThread("Thread2");
   }
}