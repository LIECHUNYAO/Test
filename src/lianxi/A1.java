package lianxi;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class A1 {
	public static void main(String[] args) {
		/*
		 * int a=1; try{ a=1/0; }catch(Exception ex){
		 * System.out.println("error");
		 * 
		 * } System.out.println(a); final String s1="woshishuaibi"; String
		 * s2=s1+2; String s3 ="woshishuaibi"; String s4 = s3+2;
		 * System.out.println("Final:"+s2+"\n"+"Yiban:"+s4); String
		 * s5="woshishuaibi2"; System.out.println((s5 == s2));
		 * System.out.println((s5 == s4)); System.out.println(s5);
		 */
		//***************************
		//         文件的创建读写
		//***************************
		File file = new File("/Users/billyao/Desktop", "try.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("文件已删除");
		} else {
			
			try {
				file.createNewFile();
				System.out.println("文件已创建");
				FileOutputStream tryy = new FileOutputStream(file);
				byte[] output ="我就试试".getBytes();
				tryy.write(output);
				tryy.close();
				} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				FileInputStream tryy = new FileInputStream(file);
				byte byt[] = new byte[1000];
				int a=tryy.read(byt);
				System.out.print(a);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print("哥们写的不对代码");
			}
		}
		//*********************
		//      throw异常
		//*********************
		//System.out.println(args.length);
		
		
	}

}
