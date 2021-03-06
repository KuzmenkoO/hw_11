package hw_11.ex_1;

public class FiveSecond implements Runnable {
    @Override
    public void run() {
        block();
        while (!Thread.interrupted()) {
            if (OneSecond.timeOfStart % 5 == 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                System.out.println("Пройшло 5 секунд");
            }
            block();
        }
    }

    private void block() {
        synchronized (OneSecond.class) {
            try {
                OneSecond.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
