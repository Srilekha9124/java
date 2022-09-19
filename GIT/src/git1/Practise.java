package git1;

public class Practise 
  {
	static int a=10; //static variable
	       int b=20; //non-static
	       
	 
	public static void static_method()
	{
		Practise p3 = new Practise();//1
		System.out.println(p3.b);
		//System.out.println(this.b);
		System.out.println(a);
		System.out.println(a);
		
	}
	public void non_static()
	{ 
		 //int b=50;
		//System.out.println(b);
		Practise p1 = new Practise();//1
		System.out.println(p1.b);
		System.out.println(this.b);//2
		System.out.println(a);
		System.out.println(b);
		
		
	}
	 
	  
	public static void main(String[] args) 
	{
		//System.out.println(a);
		//static_method();
	
		Practise p2= new Practise();
		//System.out.println(p1.b);
//		
		p2.non_static();
		static_method();
		
		
		
		
		
//		String v="velocity class";
//		String[] v1 = v.split("");
//		//System.out.println(v1[1]);
//		
//		for(String s:v1)
//		{
//			System.out.print(s+" ");
//		}
		
		
		
		
		
		
		
		
		
		 
		
		
	}

}
