package inProgress;

import java.math.BigInteger;

public class TestFile00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//defined outside of method
		double input, oldInput;
		
		
		//CONSTANTS
		int RAMPING_UP = 1;
		int RAMPING_DOWN = 2;
		
		double RAMP_UP_CONSTANT = 0.05;
		double RAMP_DOWN_CONSTANT = 0.05;
		
		double DELTA_LIMIT = 0.5;
		
		static double capture_value, output, oldInput;
		
		static int mode;
		
		input = Robot.oi.getLeftDriveJoystick;

		//rate of change in joystick values.
		double delta = input - oldInput;

		//is joystick being moved too fast?
		if(delta >= DELTA_LIMIT) { 
			mode=RAMPING_UP; 
			capture_value = input;
		}else if(delta <= -DELTA_LIMIT) { 
			mode=RAMPING_DOWN; 
			capture_value = input;
		} 

		//output integration
		switch(mode){
		//RAMPING UP
			case 1: 
				output+= RAMP_UP_CONSTANT;
				if(output >= capture_value) { mode = NORMAL; }
				break;
				
		//RAMPING DOWN		
			case 2:
				output-= RAMP_DOWN_CONSTANT;
				if(output <= capture_value) { mode = NORMAL; }
				break;
				
			case NORMAL:
				output = input;
				break;
			case default: break;
		}
		
		//Keep values for next loop
		oldInput = input;

		return output;
	}

}
