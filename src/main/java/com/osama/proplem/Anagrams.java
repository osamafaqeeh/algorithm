package com.osama.proplem;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        String s1="oossmm";
        String s2="mmssoo";
        System.out.println( isAnagram(s1,s2));

    }
    public static boolean isAnagram(String s1,String s2){
        HashMap<Character,Integer>anagram=new HashMap<Character, Integer>();
        if (s1.length()!=s2.length()){
            return false;
        }

        for (int i=0;i<s1.length();i++){
            Character charaAtIndex=s1.charAt(i);
            if (anagram.get(charaAtIndex)==null){
                anagram.put(charaAtIndex,1);
            }
            else {
                anagram.put(charaAtIndex,anagram.get(charaAtIndex)+1);
            }
        }
        for (int j=0;j<s2.length();j++) {
                Character charaAtIndex=s2.charAt(j);
                if (anagram.get(charaAtIndex)==null){
                    return false;
                }
                else {
                    anagram.put(charaAtIndex,anagram.get(charaAtIndex)-1);
                }
            }
        for( Map.Entry<Character, Integer> c:anagram.entrySet()){
            if (c.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}
