package _02_code_flow._1_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */
 
import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot
 
public class RobotSquare {
	
	
    public static void main(String[] args){
 
    	// This code makes a new Robot
    	Robot mrRobot = new Robot();
mrRobot.setRandomPenColor();
        // Put the robot's pen down so it can draw
		//        Use the     rob.penDown();   command.
mrRobot.penDown();
        // SPEED. Make the robot move quickly.
		//        Use the     rob.setSpeed();   command.
mrRobot.sparkle();
mrRobot.setSpeed(20);

        // DRAW.  Draw a line
    //	Use the     rob.move(); command
mrRobot.move(200);
mrRobot.setRandomPenColor();
		// TURN.  Turn 90 degrees
    	//      Use the     rob.turn();  command
mrRobot.turn(90);

        // LOOP.  Now put the DRAW and TURN code into a for loop to repeat 4 times.
		//        Did your Robot draw a square?
mrRobot.move(200);
for(int i=0; i<4; i++) {
	mrRobot.move(100);
	mrRobot.turn(90);
	mrRobot.setRandomPenColor();
}
    }
}