package com.skarlatov.interviewTest.interviewAmex;

public class Client {
    /*
    this program will determine if a given string is a palindrome
     */



    public static void main(String[] args){

        System.out.println(Client.isPalindrome(1237321));
        System.out.println(Client.isPalindrome(1234567));
    }


    public static boolean isPalindrome(int num){
        String str = Integer.toString(num);
        char[] charArr = str.toCharArray();

        int j = str.length() - 1;
        //iterate over begining to middle checking adjacent other side
        for(int i = 0; i <= str.length()/2; i++){
            if(charArr[i] != charArr[j]){
                return false;
            }
            j--;
        }

        return true;


    }
}
