package createtodelete;
	import java.util.*; 
	import java.nio.charset.StandardCharsets; 
	import java.nio.file.*; 
	import java.io.*; 
	public class ReadFile 
	{ 
	  public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 

	        e.printStackTrace(); 
	      } 
	      return lines; 
	    } 
	    public static void main(String[] args) 
	    { 
	      List l = readFileInList("C:\\Users\\raj\\eclipse\\java-2021-12\\eclipse\\fileproj\\textFile1.txt"); 
	    
	      Iterator<String> itr = l.iterator(); 
	      while (itr.hasNext()) 
	        System.out.println(itr.next()); 
	    } 
	  }