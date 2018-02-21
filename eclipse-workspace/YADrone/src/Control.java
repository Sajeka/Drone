import java.util.Scanner;

import de.yadrone.base.IARDrone;

public class Control {

	
	public void droneControl(IARDrone drone) {
		Scanner s = new Scanner(System.in);
		String command = s.next();
		drone.start();
		drone.takeOff();
		
		if (command == "f") {
			drone.getCommandManager().forward(30);
		}
		else 
			if (command == "h") {
			drone.getCommandManager().hover();
		}
		else 
			if (command == "l") {
			drone.getCommandManager().goLeft(30);
		}
		else 
			if (command == "r") {
			drone.getCommandManager().goRight(30);
		}
		else 
			if (command == "s") {
			drone.landing();
			drone.stop();
		}
		
		s.close();
	}
}
