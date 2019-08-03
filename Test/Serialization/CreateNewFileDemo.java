package Serialization;
/*
 * https://www.journaldev.com/825/java-create-new-file
 * his class shows how to create a File in Java
 */

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {

	public static void main(String[] args) throws IOException{
		
		
		File file = new File("C:\\Users\\subhasku.ORADEV\\eclipse-workspace\\Test\\src\\com\\luv2code\\serialization\\/file.txt");
        if(file.createNewFile())
        {
            System.out.println("file.txt File Created in Project root directory");
        }
        else 
        	System.out.println("File file.txt already exists in the project root directory");
        
        System.out.println(file.getCanonicalPath());
     
	}

}
