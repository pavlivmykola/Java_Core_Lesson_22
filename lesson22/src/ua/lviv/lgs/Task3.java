package ua.lviv.lgs;

public class Task3 {

	public static void main(String[] args) {
		Print nm = message -> System.out.println(message);
		
		nm.print("Найбільше значення double = "+Double.MAX_VALUE);
		nm.print("Найменше позитивне значення double = "+Double.MIN_VALUE);
		nm.print("Найменше значення double = -"+Double.MAX_VALUE);
		nm.print("Найбільше значення float = "+Float.MAX_VALUE);
		nm.print("Найменше позитивне значення float = "+Float.MIN_VALUE);
		nm.print("Найменше значення float = -"+Float.MAX_VALUE);

	}

}

interface Print {
	void print(String str);
}
