package lianxi;

import java.util.jar.Attributes.Name;

public class Ex_Thread1 extends Thread {
	//private String name;
	  Ex_Thread1 (String name) {
	super(name);	
	}
public void run(){
	for(int i=0; i<5;i++){
		System.out.println(getName()+"       runing  "+i+"       times");
		}
		/*try {
			sleep(100);
			} catch (Exception e) {
			// TODO: handle exception
		}*/
}

}
