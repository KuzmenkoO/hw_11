package hw_11.ex_1;

public class TaskOne {

    public void timer() {
        OneSecond oneSecond = new OneSecond();
        Thread one = new Thread(oneSecond);
        one.start();
        FiveSecond fiveSecond = new FiveSecond();
        Thread two = new Thread(fiveSecond);
        two.start();
    }
}
