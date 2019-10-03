package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
         Scanner read = new Scanner(System.in);
         int N = 100;
         String sentence;
         System.out.println("nhap vao mot cau: ");
         sentence = read.nextLine();
         int words = countWords(sentence);
         System.out.println("so tu la "+words);
    }
     private static int countWords(String sentence){
        char SPACE = ' ';
        int dem = 0;
         for(int i = 0;i < sentence.length();i++){
             if(sentence.charAt(i) == SPACE){
                 dem++;
             }
         }
         return dem+1;
     }
}
