package constructor;

public class Defaultconstructor {
	
	int id;  
	String name;  
	//method to display the value of id and name  
	void display(){System.out.println(id+" "+name);}  
	  
	public static void main(String args[]){  
	//creating objects  
		Defaultconstructor s1=new Defaultconstructor();  
		Defaultconstructor s2=new Defaultconstructor();  
	//displaying values of the object  
	s1.display();  
	s2.display();  
	}  
	}  


