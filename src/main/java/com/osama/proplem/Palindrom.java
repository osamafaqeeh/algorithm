package com.osama.proplem;

import java.util.Stack;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom("1111112"));
    }
    public static boolean isPalindrom(String string){
        Stack<Character>stack=new Stack<Character>();
        for (int i=0;i<string.length();i++){
            stack.push(string.charAt(i));
        }
        for (int j=0;j<stack.size();j++){
            if (string.charAt(j)!=stack.pop()){
                return false;
            }
        }
        return true;

    }
}
