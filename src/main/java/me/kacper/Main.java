package me.kacper;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Character> chr = new ArrayList<>();
    private static final ArrayList<Character> c = new ArrayList<>();

    public static void main(String[] args) {

        int dot = 0;
        double word = 0.1;

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (char x : text.toCharArray()) {
            c.add(x);
        }
        c.add('$');


        for (char c : text.toCharArray()) {
            if (c == '.'
            || c == '?'
            || c == '!'
            || c == '$') {
                dot = dot + 1;
            }
            chr.add(c);
        }

        String[] r = text.split(" ");
        ArrayList<String[]> list = new ArrayList<>();
        list.add(r);
        for (String[] strings : list) {
            for (String s : strings) {
                word = word  + 1;
            }
        }
        if (word / dot > 10.1) {
            System.out.println("HARD");
        }  else {
            System.out.println("EASY");
        }
    }
}
