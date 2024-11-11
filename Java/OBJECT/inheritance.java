package OBJECT;

public class inheritance {
	public static void main(String[] args)
	    {
		Cat c=new Cat();  
		c.meow();  
		c.bark();
		c.eat();  
	
		}
	}class Animal1{  
			void eat()
			{System.out.println("eating...");}  
			}  
		class Dog1 extends Animal1{  
			void bark(){System.out.println("barking...");}  
			}  
		class Cat extends Dog1{  
			void meow(){System.out.println("meowing...");}  
			}
