package by.academy.lesson2.operators;

public class SimpleOperators {
	
	public static void main(String[] args) {
		int number = 5;
		number = -number;
		number = +number;
		
		System.out.println(number);
		
		boolean bool = true;
		bool = !bool;
		System.out.println(bool);
		
		char a = 'A';
		c = (char) (c + 1);
		System.out.println(c);
		
		int a = 6 % 5;
		double b = 6.2 % 5.0;
		System.out.println(a);
		System.out.println(b);
		
		int number1 = 10;
		System.out.println(number1);
		number1 +=10;
		System.out.println(number1);
		number1 -=10;
		System.out.println(number1);
		number1 *=10;
		System.out.println(number1);
		number1 /=10;
		System.out.println(number1);
		number1 %=10;
		
		int j = 0;
		--i;
		++i;
		System.out.println(j++); // 0
		System.out.println(++j); // 2
	}

}
