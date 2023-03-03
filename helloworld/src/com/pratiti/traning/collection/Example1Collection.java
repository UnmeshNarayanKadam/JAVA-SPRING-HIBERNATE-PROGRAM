package com.pratiti.traning.collection;
import com.pratiti.traning.practice.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Example1Collection {
	public static void main(String[] args) {
		
		
		List<Person>l3 = new ArrayList<>();
		l3.add(new Person("Rohit",21));
		l3.add(new Person("Unmesh",22));
		l3.add(new Person("Unmesh",20));
		l3.sort((p1,p2)->{
			int order = p1.getName().compareTo(p2.getName());
			if(order==0) {
				order = p2.getAge()-p1.getAge();
			}
			return order;
		});
		l3.sort(Comparator.comparing(Person::getName));
		l3.forEach(str->System.out.println(str.getName()+" "+str.getAge()));
		
		
		
		
//		List<String> l = new ArrayList<>();
//		l.add("abc");
//		l.add("zsx");
//		l.add("klp");
//		l.add(1, "unemsh");
//		Collections.sort(l);
//		l.forEach(str->System.out.println(str));
//		
//		List<String>l1 = new ArrayList<>();
//		l1.add("qwe");
//		l1.add("uty");
//		l.addAll(2, l1);
//		
//		Iterator<String>it = l1.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(" "+it.next() + " ");
//		}
//		
//		l.remove(1);
//		
//		System.out.println("\n");
//		
//		System.out.println(l.containsAll(l1));
//		
//		l.removeAll(l1);
//		
//		Collections.sort(l);
//		
//		System.out.println("\n");
//		for(String s : l) {
//			System.out.println(s);
//		}
//		
//		l.forEach(str->System.out.println(str));
		
	}
}
