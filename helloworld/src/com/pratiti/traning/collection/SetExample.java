package com.pratiti.traning.collection;
import com.pratiti.traning.practice.Person;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		Set<String> st1 = new HashSet<>();
		st1.add("Uanmesh");
		st1.add("Rohit");
		st1.add("Unmesh");
		st1.add("Shivam");
		st1.add("cwUnmesh");
		st1.add("weShivam");
		//st1.add("Unmesh");
		for (String str : st1) {
			System.out.println(str);
		}
		
		Set<Integer>st2 = new HashSet<>();
		st2.add(3);
		st2.add(14);
		st2.add(35);
		st2.add(18);
		st2.add(2);
		for (Integer i : st2) {
			System.out.println(i);
		}
		
		Set<Person>st3=new HashSet<>();
		Person p1 = new Person("qwe",44);
		Person p2 = new Person("abc",44);
		Person p3 = new Person("qwe",454);
		st3.add(p1);
		st3.add(p2);
		//st3.remove(p3);
		for (Person p : st3) {
			System.out.println(p.getName()+" "+p.getAge());
		}
		System.out.println("-------------------------------------------");
		Set<String> st4 = new TreeSet<>();
		st4.add("Uanmesh");
		st4.add("Rohit");
		st4.add("Unmesh");
		st4.add("Shivam");
		st4.add("Cwnmesh");
		st4.add("Wehivam");
		for (String st : st4) {
			System.out.println(st);
		}
		
		System.out.println("-------------------------------------------");

		class PersonCompartor implements Comparator<Person>{

			@Override
			public int compare(Person o1, Person o2) {
				return o2.getName().compareTo(o1.getName());
			}
			
		}
		class PersonACompartor implements Comparator<Person>{

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge()-o2.getAge();
			}
			
		}
		
		
		Set<Person>st5=new TreeSet<>(new PersonCompartor());
		Person p4 = new Person("Anu",22);
		Person p5 = new Person("Devesh",44);
		Person p6 = new Person("Sherya",33);
		Person p7 = new Person("Amit",11);
		Person p8 = new Person("Zmit",12);
		Person p9 = new Person("Bmit",13);

		st5.add(p4);
		st5.add(p5);
		st5.add(p6);
		st5.add(p7);
		st5.add(p8);
		st5.add(p9);
		for(Person p : st5) {
			System.out.println(p);
		}
	}

}
