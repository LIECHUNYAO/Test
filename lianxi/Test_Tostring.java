package lianxi;

public class Test_Tostring {
	private String name;
	private int age;
	@Override
	public String toString() {
		return "Test_Tostring [name=" + name + ", age=" + age + "]";
	}
	Test_Tostring(int a, String b){
		this.age=a;
		this.name=b;
	}
	public static void main(String[] args) {
		Test_Tostring a = new Test_Tostring(5, "yihan");
		Test_Tostring b =new Test_Tostring(6, "tianqi");
		System.out.println(a.toString());   // 其实没什么鸟用啊 -- 
	}
}
