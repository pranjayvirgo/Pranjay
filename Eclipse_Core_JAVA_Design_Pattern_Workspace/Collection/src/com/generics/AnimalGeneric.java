package com.generics;

import java.util.ArrayList;
import java.util.List;

public class AnimalGeneric {
public void checkup(List<? super Dog> animal )
{
	animal.add(new Dog());
	System.out.println(animal);
		
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Dog> dog=new ArrayList<Dog>();
dog.add(new Dog());
dog.add(new Dog());
List<Cat> cat=new ArrayList<Cat>();
cat.add(new Cat());
cat.add(new Cat());
AnimalGeneric ag=new AnimalGeneric();
List<Animal> a=new ArrayList<Animal>();
ag.checkup(dog);
ag.checkup(a);                                                                                           

	}

}
