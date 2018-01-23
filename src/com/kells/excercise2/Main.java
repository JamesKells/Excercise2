package com.kells.excercise2;

/**
 * Created by 004159 on 1/23/2018.
 */
public class Main {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Integer[] tempOfWeek = {45, 29, 10, 22, 41, 28, 33 };
        Integer[] precipationOfWeek = {95, 60, 25, 5, 0, 75, 90};

        for (int i = 0; i < 7; i++) {

            if (tempOfWeek[i] < 33 && precipationOfWeek[i] > 50) {
                System.out.println(daysOfWeek[i]);
            }

        }

    }

}
