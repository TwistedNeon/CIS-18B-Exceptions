	package gupta.alex;
	import java.util.Scanner;
	import animal.Animal;
	import animal.carnivore.Lion;
	import animal.herbivore.Giraffe;
	
	public class Main {

	public static void main(String[] args) {
		
		String input;
		Scanner reader = new Scanner(System.in);
		Lion lion = new Lion();
		Giraffe giraffe = new Giraffe();
		
//4. In your main function instantiate an array of type Animal and fill it with any number of Lions and Giraffes
		Animal [] animals = {lion,giraffe};

//5. Start by printing out a message to the user tell them how many animals are in the array.
		System.out.println("There are " + animals.length + " animals in the array.");
		
//6. Ask the user to enter a number for which animal they want more information on.
		System.out.println("Enter a number to find an animal at that location:");
		input = reader.nextLine();
		
		try {
			
//8. -> if a user enters a number outside the bounds of the animal array -v
			if(Integer.parseInt(input) < 0 || Integer.parseInt(input) >= animals.length) {
				throw new Exception();
			}
			
//7. Have the animal at that spot in the array call it's "getName" function (remember that arrays start at 0).
			else {
				System.out.println(animals[Integer.parseInt(input)].getName());
			}
			
		}
		
//8. Use a catch block to catch -^ 
		catch(Exception e){
			
//8. -> and tell the user "You entered an invalid number!"
			System.out.println("You entered an invalid number!");
		}
		
//9. Whether or not the exception was caught, print out "Goodbye" to the user 
//	 (Hint: Remember that we use "finally" to take action regardless of whether or not a try block completes.
		finally{
			System.out.println("Goodbye!");
		}
		
//		System.out.println(lion.speak());
//		System.out.println(giraffe.speak());
	}

}
