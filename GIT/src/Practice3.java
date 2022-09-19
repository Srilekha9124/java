

public class Practice3 extends Practise
{
	static int  a=10;
	int b=90;
	
	
	public static void staticmethod()
	{
		System.out.println("static");
	}
	public void non_static()
	{
		System.out.println(b);
		System.out.println(super.b);
	}
	
	
	
	public static void main(String[] args) 
	{
		
//		System.out.println(a);
//		staticmethod();
//		
		Practice3 p=new Practice3();
//		System.out.println(p.b);
//		System.out.println(p.a);
		p.non_static();
		
//		p.a=100;
//		System.out.println(p.a);
//		
//		p.b=50;
//		System.out.println(p.b);
//		
//		Practice3 p1=new Practice3();
//		System.out.println(p1.b);
//		System.out.println(p1.a);
//		
		
		
		
		
		

	}

}
