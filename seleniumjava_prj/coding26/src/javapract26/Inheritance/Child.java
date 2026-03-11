package javapract26.Inheritance;

public class Child extends Parent{
 	static void one()
	{
		System.out.println("childs static mthd-c1");
	}
 	static void five()
 	{
 		System.out.println("childs static non over ridden method-c5");
 	}
	
void three()
{
	System.out.println("Childs non static mthd-c3");
}
void six()
{
	System.out.println("child non static over ridden methods-c6");
}
	 
	public static void main(String[] args)
{
		Parent p=new Child();
       p.one();
       p.two();
       p.three();
       p.four();
      System.out.println("                            ");
     
		System.out.println("Accessing through child object");
		Child c=new Child();
		c.one();
		c.two();
		c.three();
		c.four();
		c.five();
		c.six();
	}

}
