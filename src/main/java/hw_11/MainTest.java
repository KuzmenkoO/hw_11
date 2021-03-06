package hw_11;

import hw_11.ex_1.TaskOne;
import hw_11.ex_2.TaskTwo;

public class MainTest {
    public static void main(String[] args) {
        //Завдання №2
        System.out.println("Завдання №2");

        TaskTwo taskTwo = new TaskTwo();
        taskTwo.ReplaceNumbersWithText(15);
        System.out.println();


        // Завдання №1 (Вимагає ручної зупинки)
        System.out.println("Завдання №1");

        TaskOne taskOne = new TaskOne();
        taskOne.timer();
    }
}
