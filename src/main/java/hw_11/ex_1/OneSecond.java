package hw_11.ex_1;

public class OneSecond implements Runnable {
    public static int timeOfStart =1;

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Від запуску програми пройшло: " + timeOfStart);
            timeOfStart++;
            synchronized (OneSecond.class){
                OneSecond.class.notifyAll();
            }
        }
    }
}
