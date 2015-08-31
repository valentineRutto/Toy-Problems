// VOWEL COUNT
// LANGUAGE: JAVA

// Create a VowelCount class with a vowelCount method and a main method.
// The vowelCount method should contain the algorithm and the main method
// should be used for testing your algorithm.To make testing easier, make the vowelCount method static.

// Given an input of a String sentence, count the number of vowels that occur in the sentence.
// Return a HashMap object containing the vowels as keys and their counts as values.

// Example:
// HashMap vowelMap = VowelCount.vowelCount("mary had a little lamb");
// vowelMap.get('a'); // 4
// vowelMap.get('i'); // 1
// vowelMap.get('e'); // 1
// vowelMap.get('o'); // null
// HashMap vowelMap = VowelCount.vowelCount("do we control our computers, or do they control us?");
// vowelMap.get('o'); // 8
// vowelMap.get('i'); // 3
// vowelMap.get('e'); // 3
// vowelMap.get('u'); // 3

import java.util.*;
import java.util.HashMap;
class VowelCount {
  // Your Code Here!
    public static void main(String[] args){
    vowelMap.get('a'); 
    vowelMap.get('i'); 
    }
    public static vowelMap(str){
        count=0;
        for(int i=0;i<str.length;i++){
            HashMap hm=new HashMap;
        if (str.charAt(i)=='a'){
            System.out.printLn(hm.put("#{i}",new int(count++;)));}
            else if(str.charAt(i)=='e'){
            count++;
            }
            else if (str.charAt(i)=='i'){
            count++;
            }
                else if(str.charAt(i)=='o'){
                count++;
                }
            else (str.charAt(i)=='u'){
            count++;
            }
            
        }
    
    }
}