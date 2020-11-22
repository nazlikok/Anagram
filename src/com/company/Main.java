package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        String introduces = "introduces";
        char[] introducesChar = introduces.toCharArray();
        Arrays.sort(introducesChar);
        int numIntroduces = 0;

        String reductions = "reductions";
        char[] reductionsChar = reductions.toCharArray();
        Arrays.sort(reductionsChar);
        int numReductions = 0;

        if (reductionsChar.length == introducesChar.length) {
            for (int i = 0; i < reductionsChar.length; i++) {
                numIntroduces = introducesChar[i];
                System.out.print(numIntroduces);
            }
            System.out.println();
            System.out.println(Arrays.toString(introducesChar));
            for (int i = 0; i < reductionsChar.length; i++) {
                numReductions = reductionsChar[i];
                System.out.print(numReductions);
            }
            System.out.println();
            System.out.println(Arrays.toString(reductionsChar));

            if (numIntroduces == numReductions) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
