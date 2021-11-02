package practice.java.modems;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class DataFiles {
  public static void main(String[] args) {
    // CREATING THE FILES
    try { //CREATE data1.txt
      File myObj = new File("data1.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created X3: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred D:");
      e.printStackTrace();
    }
    try { // CREATE data2.txt 
      File myObj = new File("data2.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created X3: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      } 
    } catch (IOException e) {
      System.out.println("An error occurred D:");
      e.printStackTrace();
    }
    try { //CREATE data3.txt 
      File myObj = new File("data3.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created X3: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      } 
    } catch (IOException e) {
      System.out.println("An error occurred D:");
      e.printStackTrace();
    }
    try { //CREATE data4.txt 
      File myObj = new File("data4.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created X3: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      } 
    } catch (IOException e) {
      System.out.println("An error occurred D:");
      e.printStackTrace();
    }


    // READING THE FILES
    try { //READ data1.txt
      File myObj = new File("Data1.txt");
      Scanner myReader = new Scanner (myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try { //READ data2.txt
      File myObj = new File("data2.txt");
      Scanner myReader = new Scanner (myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try { //READ data3.txt
      File myObj = new File("data3.txt");
      Scanner myReader = new Scanner (myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try { //READ data4.txt
      File myObj = new File("data4.txt");
      Scanner myReader = new Scanner (myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  } 
}