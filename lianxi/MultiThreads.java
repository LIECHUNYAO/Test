package lianxi;

import java.lang.reflect.Method;

public class MultiThreads implements Runnable {
	private static int tickets = 5;
	public static synchronized void Method(){
		if(tickets>0 ){
			System.out.println(tickets+"sold by "+Thread.currentThread().getName()+"\n");
		}
		else{
			
		}
		tickets--;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (tickets>0) {
			Method();
		}	
	}
	public static void main(String[] args) {
		MultiThreads m=new MultiThreads();
		Thread t1 = new Thread(m, "window1");
		Thread t2 = new Thread(m,"window2");
		Thread t3 = new Thread(m, "window3");
		t1.start();
		t2.start();
		t3.start();
	}

}
