package javapract26.Inheritance;

public class VarChild extends VarParent {

	static int x=120;
	static int x2=41;
	int y=230;
	int y2=43;
	public static void main(String[] args) {
		VarParent p=new VarChild();
		VarChild c=new VarChild();
	System.out.println("Parent ref child object");
	System.out.println(p.x);
	System.out.println(p.a);
	System.out.println(p.y);
	System.out.println(p.b);
	//System.out.println(p.x2);

	System.out.println("Child ref child object");
	System.out.println(c.x);
	System.out.println(c.x2);
	System.out.println(c.y);
	System.out.println(c.y2);
	System.out.println(c.a);
	System.out.println(c.b);
		

	}

}
