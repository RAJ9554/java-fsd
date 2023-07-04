package collections;
import java.util.*; 
public class Collection {
	public static void main(String args[]){  
		System.out.println("ArrayList");
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		System.out.println(list);
		
		 System.out.println("\n");
		 System.out.println("Vector");
		 Vector<String> v=new Vector<String>();  
		 v.add("Ayush");  
		 v.add("Amit");  
		 v.add("Ashish");  
		 v.add("Garima");  
		 System.out.println(v);
		 

		 System.out.println("\n");
		 System.out.println("LinkedList");
		 LinkedList<String> al=new LinkedList<String>();  
		 al.add("Ravi");  
		 al.add("Vijay");  
		 al.add("Ravi");  
		 al.add("Ajay"); 
		 Iterator<String> itr=al.iterator();  
		 while(itr.hasNext()){  
		 System.out.println(itr.next());  
		 
		 System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<String> set1=new LinkedHashSet<String>();  
	       set1.add("Ravi");  
	       set1.add("Vijay");  
	       set1.add("Ravi");  
	       set1.add("Ajay");  
	       System.out.println(set1);
		 
		}  
	}  
}

