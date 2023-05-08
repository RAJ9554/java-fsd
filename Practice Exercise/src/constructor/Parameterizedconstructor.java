package constructor;

public class Parameterizedconstructor {
	 int id;  
	    String name;  
	    //creating a parameterized constructor  
	    Parameterizedconstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //method to display the values  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	Parameterizedconstructor s1 = new Parameterizedconstructor(111,"Karan");  
	    	Parameterizedconstructor s2 = new Parameterizedconstructor(222,"Aryan");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  
	}  


