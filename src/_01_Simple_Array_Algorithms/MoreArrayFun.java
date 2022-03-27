package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
       public static void main(String[] args) {
		 String people[] = new String[5];
		 people[0] = "Robert";
		 people[1] = "Mike";
		 people[2] = "Bob";
		 people[3] = "Matt";
		 people[4] = "Keith";
//		printArray(people);
//		reverseArray(people);
//		everyOtherString(people);
		 randomArray(people);
       }
    

    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
        static void printArray(String[] strings) {
        	  for (int i = 0; i < strings.length; i++) {
				String s = strings[i];
				System.out.println("String at element " + i + " " + s);
			}
          }
          
            
        
            
   

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
        static void reverseArray(String[] strings) {
      	  for (int i = 4; i < strings.length; i--) {
				String s = strings[i];
				System.out.println("String at element " + i + " " + s);
			}
        }


    //4. Write a method that takes an array of Strings and prints every other String in the array.
        static void everyOtherString(String[] strings) {
      	  for (int i = 0; i < strings.length; i+=2) {
				String s = strings[i];
				System.out.println("String at element " + i + " " + s);
			}
        }

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
        static void randomArray(String[] strings) {
        
        	ArrayList<String> valueChecker =  new ArrayList<>(Arrays.asList(strings));
      	  for (int i = valueChecker.size(); i > 0; i--) {
      		
      		  Random randy = new Random();
      		int randomNumber = randy.nextInt(valueChecker.size());
				String s = valueChecker.get(randomNumber);
				
					
				String output  = valueChecker.get(randomNumber);
				valueChecker.remove(output);
					
				
				System.out.println("String at element " + randomNumber + " " + s);
      	  
      		
			}
      	  
        }
       
}
