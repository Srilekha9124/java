

public class practise2 {

	public static void main(String[] args)
	{
	
	    /* System.out.println(Practise.a);// calling static
	     Practise.static_method();
	     
	     Practise p =new Practise();//obj
	     
	     System.out.println(p.b);// calling non-static
	     p.non_static();
	 */
		
	 Global_Local_Variable v1 = new Global_Local_Variable ();
	 System.out.println(v1.g); // public global instance variable
	 System.out.println(v1.s); // protected  global instance variable
	 
	 System.out.println(Global_Local_Variable.l); // public global class variable
	 System.out.println(Global_Local_Variable.c1); // Default global instance variable
	 
	v1.local();
	Global_Local_Variable.test();
	
			
			

		
		
		   
        
	}

}
