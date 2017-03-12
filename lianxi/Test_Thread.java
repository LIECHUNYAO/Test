package lianxi;

public class Test_Thread {
	public static void main(String[] args) {
		System.out.println("主线程开始");
		Thread t1 = new Thread(new Yield1("A"));
		Thread t2 = new Thread(new Yield1("B"));
		//new Thread(new Yield1("A")).start();
		//new Thread(new Yield1("B")).start();
		try {
			t1.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("主线程结束");
	}

}
