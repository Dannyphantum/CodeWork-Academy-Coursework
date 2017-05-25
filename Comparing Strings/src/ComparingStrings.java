import java.util.Scanner;

public class ComparingStrings {

	 public static void main(String []args){
	        
	     System.out.println("How is the weather?");
	     Scanner sc = new Scanner(System.in);
	      String answer = sc.nextLine();

	        if (answer.equals("rain")){
	            System.out.println("Take your umbrella!");
	        }
	        else if (answer.equals("windy")){
	            System.out.println("Wear your jacket!");
	        }
	        else if (answer.equals("snow")){
	            System.out.println("Wear a coat and take a shovel!");
	        }
	        else if (answer.equals("stormy")){
	            System.out.println("You should stay inside!");
	        }
	        else
	            System.out.println("Enjoy your day!");
	     }
}