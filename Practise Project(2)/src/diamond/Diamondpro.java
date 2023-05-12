package diamond;
//Write a program in Java to resolve the diamond problem using OOPs’ concepts

interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  
public class Diamondpro implements First, Second  {
	   public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	Diamondpro  ob = new Diamondpro (); 
	        ob.show(); 
	    } 
	

}
//yes visible