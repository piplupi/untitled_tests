package test;

import org.junit.jupiter.api.*;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class App {
    public static int Opdracht01(String input) {
        int length = input.length();
        return length;
    }

    public boolean Opdracht02(int input) {
        if (input > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int multiply(int input) {
//        String s=String.valueOf(input);
//        String s=Integer.toString(input);//Now it will return "10"

        String s = Integer.toString(input);
        String s2 = s + s + s;

        int c = Integer.parseInt(s2);
//        int length = input.lenght();

        return c;
//        return s + s + s;

    }


}

