package ua.lviv.lgs;

public class Task3 {

	public static void main(String[] args) {
		Print nm = message -> System.out.println(message);
		
		nm.print("�������� �������� double = "+Double.MAX_VALUE);
		nm.print("�������� ��������� �������� double = "+Double.MIN_VALUE);
		nm.print("�������� �������� double = -"+Double.MAX_VALUE);
		nm.print("�������� �������� float = "+Float.MAX_VALUE);
		nm.print("�������� ��������� �������� float = "+Float.MIN_VALUE);
		nm.print("�������� �������� float = -"+Float.MAX_VALUE);

	}

}

interface Print {
	void print(String str);
}
