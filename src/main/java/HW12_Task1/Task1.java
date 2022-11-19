package HW12_Task1;

public class Task1 {
    public static void main(String[] args) {
        int time = 0;

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            time++;
            System.out.println("Time from program start = "+time);


        }
    }
}
