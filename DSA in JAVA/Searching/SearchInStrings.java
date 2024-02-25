package Searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="Atharva";
        char target='b';
        System.out.println(Search(name, target));
        System.out.println(foreachSearch(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean Search(String a,int target){
        if(a.length()==0){
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if(target==a.charAt(i)){
                return true;
            }
        }
        return false;
    }

    // using for each
    static boolean foreachSearch(String a,char target){
        for (char ch: a.toCharArray()) {
            if(ch==target){
                return true;
            }
        
        }
        return false;
    }
}
