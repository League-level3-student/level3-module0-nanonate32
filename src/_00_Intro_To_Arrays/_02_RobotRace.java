package _00_Intro_To_Arrays;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

          double screenHeight = screenSize.getHeight();
          double screenWidth = screenSize.getWidth();
           System.out.println(screenHeight);
           System.out.println(screenWidth);
          screenSize.getHeight();

		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		//Robot[] robots = new Robot [4];

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();

		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		//robots[0].setX(50);
		//robots[0].setY(500);
		//robots[1].setX(150);
		//robots[1].setY(500);
		//robots[2].setX(250);
		//robots[2].setY(500);
		//robots[3].setX(350);
		//robots[3].setY(500);
		//robots[4].setX(450);
		//robots[4].setY(500);
		
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
	 
//		boolean hasFinished = false;
//			while (!hasFinished) {
//				for (int i = 0; i < robots.length; i++) {
//				Random random = new Random();
//				robots[i].move(random.nextInt(50));
//				if(robots[i].getY() < 0) {
//					hasFinished = true;
//					JOptionPane.showMessageDialog(null, "Robot " + i + 1 + " has won!");
//				}
//		        
//         
//		}
//		}
			
			
			
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
                  
		// 7. declare that robot the winner and throw it a party!
                
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	          int radius = 100;
	          int origin_x = 960;
	          int origin_y = 540;
	          boolean hasFinished = false;
	          robots[0].setY(origin_y);
	          robots[0].setX(origin_x + radius);
				while (!hasFinished) {
					for (int i = 0; i < robots.length; i++) {
					Random random = new Random();
					int newAngle = (random.nextInt(50));
					robots[0].setX(random.nextInt(50));
					if(robots[i].getY() < 0) {
						hasFinished = true;
						JOptionPane.showMessageDialog(null, "Robot " + i + 1 + " has won!");
						
					}
			      
	         
			}
			}
}
}
