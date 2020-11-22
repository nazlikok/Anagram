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

        String deduction = "deduction";
        char[] deductionChar = deduction.toCharArray();
        Arrays.sort(deductionChar);
        int numDeduction = 0;

        if (deductionChar.length == introducesChar.length) {
            for (int i = 0; i < introducesChar.length; i++) {
                numIntroduces = introducesChar[i];
                System.out.print(numIntroduces);
            }
            System.out.println();
            System.out.println(Arrays.toString(introducesChar));
            for (int i = 0; i < deductionChar.length; i++) {
                numDeduction = deductionChar[i];
                System.out.print(numDeduction);
            }
            System.out.println();
            System.out.println(Arrays.toString(deductionChar));
            if (numIntroduces == numDeduction) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else
        {
            System.out.println(introduces + " and "+ deduction+ " have not even equal length");
        }

        if (reductionsChar.length == introducesChar.length) {
            for (int i = 0; i < introducesChar.length; i++) {
                numIntroduces = introducesChar[i];
                //System.out.print(numIntroduces);
            }
            //System.out.println();
            //System.out.println(Arrays.toString(introducesChar));
            for (int i = 0; i < reductionsChar.length; i++) {
                numReductions = reductionsChar[i];
                //System.out.print(numReductions);
            }
            //System.out.println();
            //System.out.println(Arrays.toString(reductionsChar));

            if (numIntroduces == numReductions) {
                System.out.println("yes, " + introduces + " and " + reductions + " are anagram");
            } else {
                System.out.println("no");
            }
        } else
        {
            System.out.println("not even equal");
        }

    }
}
