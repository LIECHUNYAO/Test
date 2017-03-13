package lianxi;
import java.util.Random;
public class Random1 {
	public static void main(String[] args) {
	      Random r1 = new Random(2);

          Random r2 = new Random();

          for(int i = 0;i < 3;i++){

                   System.out.println("Random(2) 随机数"+(i+1)+"   : "+r1.nextInt());

                   System.out.println("Random() 随机数"+r2.nextInt()+"\n");

          }
	}

	
}
