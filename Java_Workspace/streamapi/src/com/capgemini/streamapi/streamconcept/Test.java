package com.capgemini.streamapi.streamconcept;

import java.util.function.*;

public class Test {
	public static void main(String[] args) {

		Predicate<Integer> p=i -> ((i%2==0));
		System.out.println(p.test(10));
		System.out.println(p.test(15));
		System.out.println("-------------------------");	
		Function<Integer, Integer> f=j-> (j*10);
		System.out.println(f.apply(15));
		System.out.println("---------------");
		Supplier<Person> s=()->{
			return new Person(10, "adusumalli");
		};
		System.out.println(s.get().getAge());
		System.out.println(s.get().getName());
		System.out.println("--------------------");
		System.out.println("--------------------");
		Consumer<Person> c=j->{
			System.out.println(j.getAge());
			System.out.println(j.getName());
		};

		c.accept(new Person(25, "adusumalli"));
	}
}


