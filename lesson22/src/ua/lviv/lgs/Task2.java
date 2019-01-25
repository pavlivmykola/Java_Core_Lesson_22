package ua.lviv.lgs;

import java.util.function.Predicate;

public class Task2 {

	public static void main(String[] args) {
		
		double result = Math.random();
		check(result,n->n<0.5);

	}

	public static void check (double result,Predicate<Double> predicate) {
		if (predicate.test(result)) {
			System.out.println("орел");
		} else System.out.println("решка");
		
	}
}
