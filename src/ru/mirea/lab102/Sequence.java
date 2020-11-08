package ru.mirea.lab102;

import java.util.ArrayList;

import java.util.Collections;

public class Sequence {
    private int a;
    private int b;
    ArrayList<Integer> myList = new ArrayList<>();

    Sequence(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public void output() {
        if (b > a) {
            for (int i = b; i >= a; i--) {

                myList.add(b);


                b--;
            }
            Collections.sort(myList);
            int c = myList.size();
            for (int i = 0; i < a; i++) {
                System.out.print(myList.get(i));
            }
            System.out.println();

        } else {
            for (int i = a; i >= b; i--) {

                myList.add(a);

                a--;
            }

            int c = myList.size();
            for (int i = 0; i < a; i++) {
                System.out.print(myList.get(i));
            }
            System.out.println();

        }
    }


}



