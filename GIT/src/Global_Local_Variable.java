

public class Global_Local_Variable 
{
	public String g = "test";  //  instance global variable
	 protected int s=50;
	 
	 public static int l =100;  //  class global variable
	   static char c1 = 'm';
	
	
	public Global_Local_Variable()  //Constructor
	{
		int d =10;   // local variable
		char c= 'a' ; // local variable
		//System.out.println(d);
		//System.out.println(c);

    }
    
	
	public  void local() // non static method
	{
		System.out.println("------- NON-STATIC----------");
		int a=20; // local variable
		int b=10;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(g);  //instance global variable
		System.out.println(s);
		
		System.out.println(l);   //class global variable
		System.out.println(c1);

		
		
	}


	protected static void test()  //static method
	{
		
		Global_Local_Variable  v2 = new Global_Local_Variable ();
		
		System.out.println(v2.s);   ////instance global variable
		System.out.println(v2.g);
		
		 System.out.println(l);   //class global variable
		 System.out.println(c1);
	}
	
	

	public static void main(String[] args)
	{
		test();
		Global_Local_Variable  v1 = new Global_Local_Variable ();
		v1.local();
		//Variable.xyz();
		
	
		
		
	}

}
