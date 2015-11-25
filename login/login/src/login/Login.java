/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author Cooledge
 */
public class Login extends Application {
    
    private Scanner scan = new Scanner(System.in);
    
    
    
    //private String word;
    
    private char[] array = new char[100];
    
    public Login() {
        for(int i = 0 ; i < 100 ; i++){
            array[i] = ' ';
        }
        
        
        
        
    }
   
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Crouching Tiger Hidden Battleship");
        GridPane grid = new GridPane();
        
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle = new Text("BattleShip");
        
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, 0, 2, 1);

        Label player1 = new Label("Player 1:");
        grid.add(player1, 0, 1);

        player1.getText();
        
        TextField p1 = new TextField();
        grid.add(p1, 1, 1);

        //Label player2 = new Label("Player 2:");
        Label player2 = new Label("Player 2:");
        grid.add(player2, 0, 2);
        
        player2.getText();
         
        
        
        TextField p2 = new TextField();
        grid.add(p2, 1, 2);
        
       
        Button btn = new Button("let's play!");
        
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        
      final Text actiontarget = new Text();
        
    grid.add(actiontarget, 1, 6);
    
    
    
   btn.setOnAction(new EventHandler<ActionEvent>() {
    
       
            
    @Override
    public void handle(ActionEvent e) {
        
        
        
        System.out.println("Welcome:" + " " + p1.getText()+" "+"&" + " " + p2.getText());
        //actiontarget.setFill(Color.FIREBRICK);
        actiontarget.setId("actiontarget");
        actiontarget.setText("Welcome" + " " +p1.getText() + " " + "&" + " " + p2.getText());
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                primaryStage.hide();
                       
            }
        });
            }
            
    });
        
   

        Scene scene = new Scene(grid, 734, 400);
        primaryStage.setScene(scene);
        scene.getStylesheets().add
            (Login.class.getResource("login.css").toExternalForm());
        primaryStage.show();
        
    }
    
    public String getInput(){
        
        System.out.print("Enter location: " );
        String word = scan.next();
        System.out.println("You entered " + word);
        return word;
        
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
     System.out.println();
      System.out.println();
 }
      
    
   /* public void printBoard(char ships) {
        
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
    
 }*/
     public void placeShip(){
         System.out.print("Enter location: " );
         String word = scan.next();
         
         int r = (int)(word.charAt(0)-'A');
         int c = Integer.parseInt(word.substring(1)) - 1;
         
         int ind = r*10 + c;
         
         array[ind] = 'D';
         
         System.out.println(r +" "+ c);
         
         
         
              
        System.out.println("     1   2   3   4   5   6   7   8   9  10");
        System.out.println("   +---+---+---+---+---+---+---+---+---+---+");
      
            for (int row = 0; row < 10; row++) {
                char rowLabel = (char) ('A' + row);
                System.out.print(" " + rowLabel + " |");
           
                for (int col = 0; col < 10; col++) {
                    int index = row*10+col;
                    char value = array[index];
                    System.out.print(" " + value + " |");
                
      }
            
      System.out.println(); // end the current line
      System.out.println("   |---+---+---+---+---+---+---+---+---+---|");
      
    
      }    
         
            
      
        
     }
         
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
       
   
        Login go;
        go = new Login();
        
        go.printBoard();
        //go.getInput();
        //go.printBoard(ships);
        while(true){
        go.placeShip();
        }
            
    }
    
}
