package com.company;

import java.util.ArrayList;
import java.util.List;

public class Platformer {

    static List<Integer> list = new ArrayList<>();
    static Integer staticPosition;

    public Platformer(int n, int position) {
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        staticPosition = list.get(position);
    }

    public void jumpLeft() {
        int index = list.indexOf(staticPosition);
        list.remove(index);
        staticPosition = list.get(index - 2);
    }

    public void jumpRight() {
        int index = list.indexOf(staticPosition);
        list.remove(index);
        staticPosition = list.get(index + 2);
        staticPosition--;
    }

    public int position() {
        return staticPosition;
    }

    public static void main(String[] args) {

        Platformer platformer = new Platformer(10, 5);
        System.out.println(platformer.position());
        System.out.println("index " + list.indexOf(staticPosition));
        System.out.println(list);

        System.out.println("left");
        platformer.jumpLeft();
        System.out.println(platformer.position());
        System.out.println("index " + list.indexOf(staticPosition));
        System.out.println(list);

        System.out.println("right");
        platformer.jumpRight();
        System.out.println(platformer.position());
        System.out.println("index " + list.indexOf(staticPosition));
        System.out.println(list);

        System.out.println("left");
        platformer.jumpLeft();
        System.out.println(platformer.position());
        System.out.println("index " + list.indexOf(staticPosition));
        System.out.println(list);

        System.out.println("right");
        platformer.jumpRight();
        System.out.println(platformer.position());
        System.out.println("index " + list.indexOf(staticPosition));
        System.out.println(list);
    }
}