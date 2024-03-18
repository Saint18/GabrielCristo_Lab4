public class Main {
	public static void main(String[] args) {
		ToDoList tdl = new ToDoList();
		// addTask(int id, String description, Date date, Boolean completed, Priority
		// priority)
		tdl.addTask(101, "example 1", new Date(1, 4, 2029), false, Priority.HIGH);
		tdl.addTask(102, "example 2", new Date(2, 1, 2024), false, Priority.MEDIUM);
		tdl.addTask(103, "example 3", new Date(3, 4, 2000), false, Priority.LOW);
      	tdl.addTask(104, "example 4", new Date(3, 4, 2025), false, Priority.LOW);
      	tdl.addTask(105, "example 5", new Date(3, 4, 2000), false, Priority.LOW);
      
		System.out.println("TEST: PRINT ALL TASKS");
		tdl.printAllTasks();
		System.out.println();

		System.out.println("TEST: REMOVE TASK #103");
      	tdl.removeTask(103);
		tdl.printAllTasks();
		System.out.println();      
      		
      	System.out.println("TEST: Mark Tasks As Complete");
		tdl.getTask(102).setCompleted(true);
      	tdl.getTask(105).setCompleted(true);
      	
      	// Print out the result of 
      	//		countCompletedTasks
        System.out.println("TEST: COUNT COMPLETED TASKS");
        System.out.println(tdl.countCompletedTasks());

      	//		countExpiredTasks
        System.out.println("TEST: COUNT EXPIRED TASKS");
        System.out.println(tdl.countExpiredTasks());
        
      	//		countAllTasks
     	System.out.println("TEST: COUNT ALLTASKS");
        System.out.println(tdl.countAllTasks());
        //remove expired
        System.out.println("TEST: REMOVE EXPIRED");
        tdl.removeExpired();
        tdl.printAllTasks();
       // remove completed
        System.out.println("TEST: REMOVE COMPLETED");
        tdl.removeCompleted();
        tdl.printAllTasks();
      	// printPriorityTasks
        System.out.println("TEST: PRINTING");
        tdl.printPriorityTasks(Priority.HIGH);
        tdl.printExpiredTasks();
        tdl.printAllTasks();
      	// Change task #105's date 
        System.out.println("TEST: CHANGE DATE");
        Date date = new Date(2, 1, 2023);
        tdl.changeDate(104, date);
        tdl.printAllTasks();
	}
}
