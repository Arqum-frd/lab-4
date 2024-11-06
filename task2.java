package lab4;

class StudentTable extends Thread {
    public void run() {
        // Table for student roll numbers
        String[] rollNumbers = {
            "2022F-SE-241", "2022F-SE-242", "2022F-SE-243",
            "2022F-SE-244", "2022F-SE-245"
        };
        
        System.out.println("Student Roll Numbers Table:");
        System.out.println("--------------------------------");
        for (String roll : rollNumbers) {
            System.out.println(roll);
            try {
                // Simulate some delay between printing roll numbers
                Thread.sleep(500);  // 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class DOBTable extends Thread {
    public void run() {
        // Table for student Date of Births
        String[] dob = {
            "03-November", "12-October", "25-September",
            "01-January", "17-May"
        };
        
        System.out.println("\nStudent Date of Birth Table:");
        System.out.println("--------------------------------");
        for (String date : dob) {
            System.out.println(date);
            try {
                // Simulate some delay between printing dates of birth
                Thread.sleep(500);  // 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class task2 {
    public static void main(String[] args) {
        // Create thread instances
        StudentTable studentThread = new StudentTable();
        DOBTable dobThread = new DOBTable();
        
        // Start the threads concurrently
        studentThread.start();
        dobThread.start();
        
        try {
            // Wait for both threads to finish before continuing
            studentThread.join();
            dobThread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        System.out.println("\nBoth tables printed concurrently.");
    }
}
