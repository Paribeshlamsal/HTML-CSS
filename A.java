// Class A extends the Thread class
class A extends Thread {
    // Override the run method to define the thread's behavior
    @Override
    public void run() {
        // Print "Hello" 6 times
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
        }
    }
}

// Class B contains the main method
class B {
    public static void main(String[] args) {
        // Create an instance of class A
        A t = new A();
        // Start the thread
        t.start();

        // Print "Hi" 6 times
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hi");
        }
    }
}
