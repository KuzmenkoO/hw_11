package hw_11.ex_2;

import java.util.Arrays;

public class TaskTwo {
    private Object[] result;
    private int[] number;

    public void ReplaceNumbersWithText(int n) {
        this.number = new int[n];
        this.result = new Object[n];
        for (int i = 0; i < n; i++) {
            number[i] = i + 1;
        }
        Thread a = new Thread(() -> fizz(number));
        a.start();
        Thread b = new Thread(() -> buzz(number));
        b.start();
        Thread c = new Thread(() -> fizzbuzz(number));
        c.start();
        Thread d = new Thread(() -> number(number));
        d.start();

        System.out.println(Arrays.toString(number));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(result));

    }

    private void fizz(int[] text) {
        for (int i = 0; i < text.length; i++) {
            if (text[i] % 3 == 0 && text[i] % 5 != 0) {
                result[i] = "fizz";
            }
        }
    }

    private void buzz(int[] text) {
        for (int i = 0; i < text.length; i++) {
            if (text[i] % 3 != 0 && text[i] % 5 == 0) {
                result[i] = "buzz";
            }
        }
    }

    private void fizzbuzz(int[] text) {
        for (int i = 0; i < text.length; i++) {
            if (text[i] % 3 == 0 && text[i] % 5 == 0) {
                result[i] = "fizzbuzz";
            }
        }
    }

    private void number(int[] text) {
        for (int i = 0; i < text.length; i++) {
            if (text[i] % 3 != 0 && text[i] % 5 != 0) {
                result[i] = text[i];
            }
        }
    }
}
