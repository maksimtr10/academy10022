package by.academy.lesson1;

public class Main {
}

  public static void main(String[] args) {
	  Cat cat1 = new Cat();
	  Cat cat2 = new Cat(1);
	  Cat cat3 = new Cat(2, "Vaska");
	  Cat cat4 = new Cat(2, "Petka");

      System.out.println(cat2.getAge());
      cat2.setAge(100);
      System.out.println(cat2.getAge());
      }
  
  }  