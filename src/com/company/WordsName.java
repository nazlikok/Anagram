package com.company;
import java.util.Arrays;

public class WordsName {
    void isAnagram(String firstWord, String secondWord){
        boolean status = false;
        if(firstWord.length()==secondWord.length()){
            char[] firstArray =firstWord.toLowerCase().toCharArray();
            char[] secondArray= secondWord.toLowerCase().toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            status=Arrays.equals(firstArray,secondArray);
        }

        if (status) {
            System.out.println(firstWord + " and " + secondWord + " are anagrams");
        } else {
            //System.out.println(firstWord + " and " + secondWord + " are not anagrams");

        }

    }
}
