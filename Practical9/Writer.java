public class Writer extends Thread {

// All threads which use the data being synchronised should 
// share the same DataAccessPolicyManager object to 
// coordinate access. The instance could be passed in to the 
// constructor for the Writer class.

private DataAccessPolicyManager accessManager;


   public Writer (DataAccessPolicyManager accessManager) {
   	this.accessManager = accessManager;
   }

   public void run() {
	while (true) {

	   // Acquire writelock
	
           // Print message "writer acquired write lock"

	   // Simulate writing with 0..2 seconds of sleep i.e. sleep ((int)(Math.random()*2000));

	   // Print message "writer finished, releasing write lock

	   // Release writelock

	   // Sleep for 0..2 seconds before repeating the loop
	}

   }
}
