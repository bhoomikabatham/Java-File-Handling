package filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileDemo {

    
    public static void main(String[] args) {
        
     // Step 1: Creating a file
       try {
      File myObj = new File("bhoomika.txt"); // Creating a File object
      if (myObj.createNewFile()) {   // Checking if the file does not exist
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");// If file already exists
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
          // Step 2: Writing to the file
     try {
      FileWriter myWriter = new FileWriter("bhoomika.txt"); // Creating FileWriter object
      myWriter.write("Files in Java might be tricky, but it is fun enough!"); // Writing content to file
      myWriter.close();// Closing FileWriter
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
         // Step 3: Reading from the file
         try {
      File myObj = new File("bhoomika.txt"); // Creating a File object
      Scanner myReader = new Scanner(myObj);// Creating Scanner object to read file
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);// Printing file content
      }
      myReader.close(); // Closing Scanner
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
         // Step 4: Deleting a file
          File myObj = new File("new.txt"); // Creating a File object
    if (myObj.delete()) { // Checking if file deletion is successful
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
    }
    
}
