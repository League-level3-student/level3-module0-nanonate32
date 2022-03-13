package _00_Intro_To_Arrays;

import java.util.Arrays;
import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] foods = new String[5];
    	foods[0] = "Pizza";
    	foods[1] = "Ice cream";
    	foods[2] = "Burrito";
    	foods[3] = "Cake";
    	foods[4] = "Cookie";
    	
        // 2. print the third element in the array
           //System.out.println(" Third element of array: \n");
           for(int i = 0; i < 1; i++){
               String s = foods[3];
              // System.out.println("String at element " + 3 + " " + s);
           
        // 3. set the third element to a different value
             
        // 4. print the third element again
              //System.out.println("String at element " + 3 + " " + s);
           }
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
          // System.out.println("This is the whole array: \n");
            for (int i = 0; i < foods.length; i++) {
				String s = foods[i];
				//System.out.println("String at element " + i + " " + "banana");
			}
				
			
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
            //System.out.println("This is the whole array with varied values: \n");
            for (int i = 0; i < foods.length; i++) {
				String s = foods[i];
				//System.out.println("String at element " + i + " " + s);
			}
				
			
        // 7. make an array of 50 integers
            Integer[] ints = new Integer[50];
            ints[0] = (int)(Math.random()*100);
            int min = ints[0];
            int max = ints[0];
        // 8. use a for loop to make every value of the integer array a random
        //    number
           // System.out.println("Here's the array of ints:\n");
            
            for(Integer i : ints){
            	Random Randy = new Random();
                //System.out.println("int: " + Randy.nextInt(50));
              
           }
         

        // 9. without printing the entire array, print only the smallest number
        //    on the array
 System.out.println("Smallest number in array:\n");
 
 for(int i=1; i<50 ;i++){
     ints[i] = (int)(Math.random()*100);
     if(ints[i]<min){
         min = ints[i];
     }
    
              
			}
 System.out.println(Arrays.asList(ints));
 System.out.println("Smallest Number:" + min );
 System.out.println("\n");          	
               
            
            	  
           
            
          

        // 10 print the entire array to see if step 8 was correct
     // already done in step 8
        // 11. print the largest number in the array.
 System.out.println("Largest number in array:\n");
 
 for(int i=1; i<50 ;i++){
     ints[i] = (int)(Math.random()*100);
     if(ints[i]>max){
         max = ints[i];
     }
    
              
			}
 System.out.println(Arrays.asList(ints));
 System.out.println("Largest number:" + max );
 System.out.println("\n");
            	
        // 12. print only the last element in the array
 System.out.println("Last element in array:\n");
 for(int i=1; i<50 ;i++){
     ints[i] = (int)(Math.random()*100);
     
    }
 System.out.println(Arrays.asList(ints));
    System.out.println("Last element:" + ints[49]);
   
    }
}
  
