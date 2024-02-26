class DisplayThread extends Thread {
    private String message;
    private int intervalMillis;
    private int iterations;

    public DisplayThread(String message, int intervalMillis, int iterations) {
        this.message = message;
        this.intervalMillis = intervalMillis;
        this.iterations = iterations;
    }

    public void run() {
        for (int i = 0; i < iterations; i++) {
            try {
                System.out.println(message);
                Thread.sleep(intervalMillis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProgramThread{
    public static void main(String[] args) {
        System.out.println("Ganesh Venkatraman Bhandari");
        System.out.println("1BM22CS098");

        DisplayThread thread1 = new DisplayThread("BMS College of Engineering", 10000, 3);
        DisplayThread thread2 = new DisplayThread("CSE", 2000, 15);

        System.out.println("Ganesh Venkatraman Bhandari");
        System.out.println("1BM22CS098");

        thread1.start();
        thread2.start();
    }
}
