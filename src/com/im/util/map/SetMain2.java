package com.im.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		Random random = new Random();
		HashSet<Integer> set = new HashSet<>();
		while(true) {
			set.add(random.nextInt(45)+1);
			if(set.size() == 6) {
				break;
			}
			else {
				continue;
			}
		}
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(set);
		
	}

}
