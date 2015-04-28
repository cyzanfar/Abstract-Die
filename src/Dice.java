import java.util.Random;
public class Dice {
String name;
int[] values;
int rolledValue;
Random random = new Random();
			// constructor 
		public Dice(int faces,String name){
			//creating a table of all the faces of a dice.
			int[] values = new int[faces];
			for (int i=0;i<faces;i++){
				values[i]=i+1;
			}
			// "this" is in reference to the current object
			this.name=name;
			this.values=values;
			rolledValue = 1;
		}
			// roll the dice and get the face value.
		 public int rollDice() {
		    rolledValue = values[random.nextInt(values.length)];
		    return rolledValue;
		    }
		 public int getFaceValue(){
			 return rolledValue;
		 }
		 
		 public String toString() {
			 String result = "dice " + getFaceValue();
			 return result;
		 }
		
	
		 
}

