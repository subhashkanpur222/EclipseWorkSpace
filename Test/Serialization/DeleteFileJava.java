package Serialization;

import java.io.File;

public class DeleteFileJava {

	public static void main(String[] args) {
		 File file = new File("C:\\\\Users\\\\subhasku.ORADEV\\\\eclipse-workspace\\\\Test\\\\src\\\\com\\\\luv2code\\\\serialization\\\\/file.txt");
		 
		 if(file.delete())
		 {
	            System.out.println("C:\\\\Users\\\\subhasku.ORADEV\\\\eclipse-workspace\\\\Test\\\\src\\\\com\\\\luv2code\\\\serialization\\\\/file.txt File deleted");
	     }
		 else 
			 System.out.println("File C:\\\\Users\\\\subhasku.ORADEV\\\\eclipse-workspace\\\\Test\\\\src\\\\com\\\\luv2code\\\\serialization\\\\/file.txt doesn't exist");

	}

}
