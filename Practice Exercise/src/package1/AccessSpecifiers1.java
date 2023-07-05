package package1;
class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 
//2. using private access specifiers
class priaccessspecifier 
{ 
 private void display() 
  { 
      System.out.println("You are using private access specifier"); 
  } 
} 


public class AccessSpecifiers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 
        System.out.println("Private Access Specifier");
		priaccessspecifier obj1 = new priaccessspecifier();


	}

}
