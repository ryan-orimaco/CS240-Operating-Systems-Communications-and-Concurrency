public class Reader extends Thread {

// All threads which use the data being synchronised should 
// share the same DataAccessPolicyManager object to 
// coordinate access. The instance could be passed in to the 
// constructor for the Reader class.

private DataAccessPolicyManager accessManager;


   public Reader (DataAccessPolicyManager accessManager) {
   	this.accessManager = accessManager;
   }

   public void run() {
	while (true) {

	   // Acquire readlock
	
           // Print message "Reader acquired read lock"

	   // Simulate reading with 0..2 seconds of sleep i.e. sleep ((int)(Math.random()*2000));

           // Print message "Reader finished, releasing read lock"

	   // Release readlock

	   // Sleep between 0..2 seconds before repeating the loop

	}

   }
}
