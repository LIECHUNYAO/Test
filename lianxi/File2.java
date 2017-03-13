package lianxi;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
public class File2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content[] = {"我是帅哥吗","你说呢baby","ofcourse！you are！"};
		File cool = new File("/Users/billyao/Desktop","test.txt");   //"C:\\demo1.txt" windows
		try {
			FileWriter fw = new FileWriter(cool);
			BufferedWriter bufw = new BufferedWriter(fw);
			for (int i = 0; i < content.length; i++) {
				bufw.write(content[i]);
				bufw.newLine();
			}
			System.out.println("creat field successfully");
			bufw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
				

	}

}
