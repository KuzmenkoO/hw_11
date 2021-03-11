package hw_11.ex_1;

import java.time.Instant;

public class FiveSecond implements Runnable {
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            if (OneSecond.timeOfStart % 5 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                block();
                System.out.println("Пройшло 5 секунд");
                System.out.println(Instant.now());
            }
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
