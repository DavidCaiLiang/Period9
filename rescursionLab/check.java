import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class check{
  public static void main(String[] args) {
    boolean check = true;
    try {
      File file = new File("main.txt");
      Scanner standard = new Scanner(file);
      Scanner test = new Scanner(args[0]);
      while (test.hasNextLine() && test.hasNextLine()) {
        String line = test.nextLine();
        String stan = standard.nextLine();
        if (line.equals(stan)) {
          check = false;
          System.out.println("Standard: "+stan);
          System.out.println("Input: "+line);
        }
        if (test.hasNextLine() && !test.hasNextLine() || !test.hasNextLine() && test.hasNextLine()) {
          System.out.println("Both items don't have the same length!");
          check = false;
        }
      }
      standard.close();//releases the file from your program
      test.close();
    } catch (FileNotFoundException ex) {
      //File not found
    }
    if (check) {
      System.out.println("Test Passed!");
    }
    else {
      System.out.println("Test Failed!");
    }
  }
}
