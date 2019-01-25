package ua.lviv.lgs;

public class Task5 {

	public static void main(String[] args) {
		Methods eat = () -> System.out.println("eat");
		Methods sleep = () -> System.out.println("sleep");
		Methods swim = () -> System.out.println("swim");
		Methods walk = () -> System.out.println("walk");
		
		eat.print();
		sleep.print();
		swim.print();
		walk.print();
		
	}

}

interface Methods{
	void print();
}