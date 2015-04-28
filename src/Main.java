import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
		int input1;
		// program execute until condition is met
		do{
			Scanner scan = new Scanner(System.in);
			// Prompt user for number of die
			System.out.println("Type 0 at any time to quit the game!\n");
			System.out.println("How many dice do you want to roll?");
			input1 = scan.nextInt();
			// arrayList
			ArrayList<Dice> diceList2 = new ArrayList<Dice>();
			// create array 
			Dice[] diceList = new Dice[input1];

			//-----------------------------------------------------------------
			//for loop that creates a dice-- the dice can have any number of face
			//-----------------------------------------------------------------
			for (int i=0;i<input1;i++){
				String name = "dice"+ Integer.toString(i+1); // give distinctive name for each dice
				Dice dice = new Dice(6,name);      //create dice object and give 2 argument # of face/name
				diceList2.add(dice);		// add dice object to ArrayList
				diceList[i]=dice;			// add dice object to array
			}

			// roll dice ArrayList           
			int sum = 0;
			for (Dice diceElem : diceList2) { 	// for each dice in the ArrayList
				int val = diceElem.rollDice(); // roll them (randomize the values)
				System.out.println(diceElem.name + " " + val);
				sum += val; // sum of dice in ArrayList
			}

			System.out.println();

			// roll dice Array
			int sum1 = 0;
			for (int i = 0; i<input1; i++) {
				int val1 = diceList[i].rollDice();
				System.out.println(diceList[i].name + " " + val1);
				sum1 += val1;
			}


			if (input1 == 0) {
				System.out.println("Game Over");
				// comparing the array and arrayList sum.
			}else if (sum > sum1) {
				System.out.println("The sum of the ArrayList: " + sum);
				System.out.println("is larger than the array: " + sum1);
			}else if (sum == sum1) {
				System.out.println("The sum of the ArrayList and Array are equal: " + sum );
			}else if  (sum < sum1) {
				System.out.println("The sum of the Array: " + sum1);
				System.out.println("Larger than the ArrayList: " + sum);
			}

		
		}while (input1!= 0);
	}
}


