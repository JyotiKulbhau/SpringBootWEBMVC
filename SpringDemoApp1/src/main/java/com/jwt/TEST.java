package com.jwt;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;

public class TEST {
	
	
	public static String reverseString(String re) {
		String s="";
		for(int i=re.length()-1;i>=0;i--) {
			s=s+re.charAt(i);
		}
		return s;
	}

	public static void occurenceOfCharacters() {
		String re="APPLE";
		char []car=re.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:car) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c,1);
			}
			//System.out.println(c+" occurs "+map.get(c)+"");
		}
		
		Set<Map.Entry<Character, Integer>> es=map.entrySet();
		for(Map.Entry<Character,Integer> me:es) {
			System.out.println(me.getKey()+" oc times "+me.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		//System.out.println("reverseString +"+reverseString(re));
		
		String[] arr= {"Java","PHP","CSS","Java","java","php"};
		
        Set set=new LinkedHashSet<String>();		
		
		for(String word:arr) {
			set.add(word.toLowerCase());
		}
		
		String[] arr1=(String[]) set.toArray(new String[0]);
		
		System.out.println(Arrays.toString(arr1));
		
	}
	
	
	
	
}
