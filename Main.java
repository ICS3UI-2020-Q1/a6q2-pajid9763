import java.util.Scanner;
/**
 * program that creates search algorithm
 * @author Darian 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numbers[] = new int[10];

    // ask the user to enter 10 integers
    System.out.println("Please enter in 10 integers to put into the array");
    for (int i = 0; i < numbers.length; i++){
      numbers[i] = input.nextInt();
    }

    // ask the user what number they want to find
    System.out.println("Please enter a number to find");
    int numFind = input.nextInt();

    // locate the desired number
    for (int i = 0; i < numbers.length; i++){
      if (numbers[i] == numFind){
        System.out.println(numFind + " is located at index " + i);

      }else if (i < numFind || i > numFind){

      }
      
    }
    
  }
}
