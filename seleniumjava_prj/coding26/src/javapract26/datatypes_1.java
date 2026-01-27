package javapract26;

public class datatypes_1 {
	int a;
	static int b=10;
	public void adddt()
	{
		int c=a+b;
		System.out.println("value of c is "+c);
	}
	public void substract()
	{
		int c=b-1;
		System.out.println("value from substraction"+c);;
	}

	public static void main(String[] args) {
		datatypes_1 dt=new datatypes_1();
		dt.adddt();
		dt.substract();
	}

}
