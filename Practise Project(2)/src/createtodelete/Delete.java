package createtodelete;
import java.io.IOException; 
import java.nio.file.*; 
public class Delete {
	public static void main(String[] args) 
    { 
        try
        { 
            Files.deleteIfExists(Paths.get("C:\\Users\\Akshatha\\eclipse\\java-2022-06\\eclipse\\fileproj\\textFile1.txt")); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
        System.out.println("Deletion successful."); 
    } 

}
