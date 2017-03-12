package lianxi;

public class Ex_Thrad2 implements Runnable {
	private String name;
	Ex_Thrad2(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(name+"  running  "+i+"   times  ");
			
		}
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
	}

}
