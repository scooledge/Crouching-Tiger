
import java.util.*;

public class BattleBoard{
  
  
  
  private int[][] b;
  
  private java.util.Scanner scan;
  
   private int count;
  
  public BattleBoard(){
    
    int[][] b = new  int[10][10];
    
    
     scan = new java.util.Scanner(System.in);
     
     count = 0;
  }
  
  public void printBoard() {
    System.out.println("     1   2   3   4   5   6   7   8   9  10");
    System.out.println("   +---+---+---+---+---+---+---+---+---+---+");
    for (int row = 0; row < 10; row++) {
      char rowLabel = (char) ('A' + row);
      System.out.print(" " + rowLabel + " |");
      
      for (int col = 0; col < 10; col++) {
        char value = ' ';
        System.out.print(" " + value + " |");
      }
      System.out.println(); // end the current line
      System.out.println("   |---+---+---+---+---+---+---+---+---+---|");
    }
    /*
        System.out.println("    1   2   3   4   5   6   7   8   9  10");
        System.out.println("   ---+---+---+---+---+---+---+---+---+---");
        System.out.println("A |" + b +"   |   |   |   |   |   |   |   |   |   |");
        System.out.println("  |---+---+---+---+---+---+---+---+---+---");
        System.out.println("B |   |   |   |   |   |   |   |   |   |   |");
        System.out.println("  |---+---+---+---+---+---+---+---+---+---");
        System.out.println("C |   |   |   |   |   |   |   |   |   |   |");
        System.out.println("  |---+---+---+---+---+---+---+---+---+---");
        System.out.println("D |   |   |   |   |   |   |   |   |   |   |");
        System.out.println("  |---+---+---+---+---+---+---+---+---+---");
        System.out.println("E |   |   |   |   |   |   |   |   |   |   |");
        System.out.println("  |---+---+---+---+---+---+---+---+---+---");
        System.out.println("F |   |   |   |   |   |   |   |   |   |   |");
        System.out.println("  |---+---+---+---+---+---+---+---+---+---");
        System.out.println("G |   |   |   |   |   |   |   |   |   |   |");
        System.out.println("  |---+---+---+---+---+---+---+---+---+---");
        System.out.println("H |   |   |   |   |   |   |   |   |   |   |");
        System.out.println("  |---+---+---+---+---+---+---+---+---+---");
        System.out.println("I |   |   |   |   |   |   |   |   |   |   |");
        System.out.println("  |---+---+---+---+---+---+---+---+---+---");
        System.out.println("J |   |   |   |   |   |   |   |   |   |   |");
        System.out.println("  |---+---+---+---+---+---+---+---+---+---");*/
    }
  
  public void print() {
    
    System.out.println(b);
  }
  
  public final int getInput() {
        // prompt the user for input
        System.out.print("Enter a number: ");
        // verify that the input is an integer
        while( ! scan.hasNextInt()) {
            // throw away the input value
            scan.next();
            // report the error
            System.out.println("Non-numeric input. Please try again.");
            // prompt again
            System.out.print("Enter a number: ");
        }
        // return the numeric (integer) value
        return scan.nextInt();
    }
  public int boardNull() {
    
 
   
    while(b != null) {
      b[0][0] = 1;
    }
  return b[0][0];
  
  }
  public static void main (String[] args) {
    BattleBoard go = new BattleBoard();
    
    go.getInput();
    go.printBoard();
    //go.getInput();
    go.print();
  }}