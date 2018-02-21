import de.yadrone.base.ARDrone;
import de.yadrone.base.IARDrone;
import de.yadrone.base.command.CommandManager;

public class DroneMain {

	public static void main(String[] args) {
		  IARDrone drone = null;
		  drone = new ARDrone();
		  CommandManager cmd = drone.getCommandManager();
		  Control cnt = new Control();
		  
		  
		    try
		    {
		    	cnt.droneControl(drone);
		    	System.out.println("write your commands");
		    }
		    catch (Exception exc)
			{
				exc.printStackTrace();
			}
			finally
			{
				if (drone != null)
					drone.stop();
				System.exit(0);
			}

	}

}
