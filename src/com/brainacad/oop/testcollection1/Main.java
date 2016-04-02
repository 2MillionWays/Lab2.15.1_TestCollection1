package com.brainacad.oop.testcollection1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strCol = new ArrayList<>();
        int count = 0;

        while (count<=10){
            strCol.add("number_"+count);
            count++;
        }
        for (String element : strCol){
            System.out.println(element);
        }
    }
}
