package com.security;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Demo1 {

	
    public static void main(String[] args) {
		 
    	List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
    	List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
    	//System.out.println("filtered array is not empty:"+filtered);

    	List<Integer> numericArray = Arrays.asList(22,33,56,46,3,11);
    	List<Integer> filteredNumericArray = numericArray.stream().filter(ele -> ele%2==0).collect(Collectors.toList());
    	
    	//System.out.println("Numeric array even Numbers : "+filteredNumericArray);
    	
    	//forEach
		/*
		 * Random random= new Random();
		 * random.ints().limit(5).sorted().forEach(System.out::println);
		 */
    	
    	List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
    	
    	nums.stream().filter(a->a%2==0).map(a-> a+a).filter(a->a>5).forEach(a->System.out.println(a));
    	
    	
    	
    	
    	
	}
}
