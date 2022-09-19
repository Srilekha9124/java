

public class Demo {
	
	static int a=10;
	    int b=20;
	  
	public static void static_method()
	{
		System.out.println("this is a static method of demo");
	}
	
	public void non_static_method()
	{
		System.out.println("this is non static method of demo");
	}
	    
  public static void main(String[] args) 
	{
		System.out.println(a);//calling static variable
		Demo.static_method();
    
		String String ="ABC";
		int v =1;
				
		
    	Demo d=new Demo();//memory created/object created
		                  // d is a reference of object
		
		System.out.println(d.b);//calling non static variable
		d.non_static_method();
		
      	d.b=50;
       System.out.println(d.b);
	  System.out.println(d.a);
//		
		//Demo e =new Demo();
		
		
		
		

	}

}
