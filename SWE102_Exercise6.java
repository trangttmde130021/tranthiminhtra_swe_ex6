/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe102_exercise6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class SWE102_Exercise6 {
    public static String ReplaceRepetitive(String s) {
        String[] words = s.split("\\s");
        ArrayList <String> list = new ArrayList<>();
        String result = "";
        for (String w : words) {
            list.add(w);
        }
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) { 
                    index.add(j);
                    list.set(i,"REPEAT");
                }   
                else{
                    break;
                }
            } 
        }
        for (Integer integer : index) {
            list.set(integer, "");
        }
        for (String string : list) {
            if(!string.equals("")){
                result = result +  string + " ";
            }
        }
        result = result.replace("\\s+","");
        return result;
    }

    public static void main(String[] args) {
        //Case 1:
        System.out.println("Case 1: I want to go to to the zoo");
        System.out.println("Expect out : I want to go REPEAT the zoo ");
        System.out.println("Release output: " + ReplaceRepetitive("I want to go to to the zoo"));
        System.out.println("======================================================================");
        //Case 2:
        System.out.println("Case 2: I want to go to to to the zoo");
        System.out.println("Expect out : I want to go REPEAT the zoo ");
        System.out.println("Release output: " + ReplaceRepetitive("I want to go to to to  the zoo"));
        System.out.println("======================================================================");
        //Case 3: 
        System.out.println("Case 3: I I  want to go to the zoo ");
        System.out.println("Expect out : REPEAT want to go to the zoo ");
        System.out.println("Release output: " + ReplaceRepetitive("I I  want to go to the zoo"));
        System.out.println("======================================================================");
        //Case 4: 
        System.out.println("Case 4: I want to go to the zoo zoo zoo");
        System.out.println("Expect output : I want to go REPEAT the zoo ");
        System.out.println("Release output: " + ReplaceRepetitive("I I  want to go to the zoo"));
        System.out.println("======================================================================");
        //Case 5: 
        System.out.println("Case 5: I want to go GO  to the zoo ");
        System.out.println("Expect output : I want to  REPEAT to the zoo ");
        System.out.println("Release output: " + ReplaceRepetitive("I want to go GO  to the zoo "));
    }
}
    

