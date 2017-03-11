package lianxi;

public class Yield1 implements Runnable  {
	
	private  String name;
	public Yield1(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <50; i++) {
			System.out.println(name+"  running  "+i+"  times  ");
			if (i==30) {
			Thread.yield();
				System.out.println("-------------"+new Thread(new Yield1(name)).getPriority()+"-------------------");
			}
			
		}
	}

}
