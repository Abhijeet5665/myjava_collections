package com.serenity.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * This is an example for recurrence
 * 
 */

public class RecurrenceExample {
	
	public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"India", "Uganda", "Vietnam", "America", "England", "Japan", "China"});
        System.out.println("Original Array:\n"+ list);
        List<String> revList = new ArrayList<>();
        recReverseList(list,revList);
        System.out.println("Reversed Array:\n"+ revList);
    }

	/**
	 * To reverse an array using recurrence 
	 */
    private static void recReverseList(List<String> list, List<String> revList) {
        if(list.size()!=0) {
            revList.add(list.get(list.size()-1));
            recReverseList(list.subList(0,list.size()-1),revList);
        }
    }
}
