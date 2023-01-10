package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class counter {
    public static void main(String[] args) {

        String myString;
        myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> characters = new HashMap<>();
        char[] charactersInString = myString.toCharArray();
        String symbol = String.valueOf(charactersInString);
        for (  char c : charactersInString) {
            Integer integer = characters.get(c);
            if (integer == null) {
                characters.put(c, 1);
            } else {
                characters.put(c, integer + 1);
            }
        }
        for(Map.Entry<Character, Integer> character : characters.entrySet()){
            System.out.println(character.getKey() + ":" + character.getValue());
        }
    }
}

