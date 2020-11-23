package com.company;
import java.util.*;
import java.lang.*;

public class Main {
    static String[] words = {"introduces", "reductions", "deduction","discounter","discounted","harmonicas","maraschino","percussion","supersonic"};

    public static void main(String[] args) {
        WordsName test = new WordsName();
        for (int i = 0; i < words.length; i++) {
            for(int j=i; j< words.length; j++){
                if(i==j){
                    continue;
                }
                //System.out.println(i +" " + j);
                test.isAnagram(words[i], words[j]);
            }
        }
    }
}




