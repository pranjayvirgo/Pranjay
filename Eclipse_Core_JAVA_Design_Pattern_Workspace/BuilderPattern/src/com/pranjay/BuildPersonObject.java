package com.pranjay;


public class BuildPersonObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person person=new Person.PersonBuilder("pranjay","singh").setEmploymentType("salaried").setMarried(true).buildPerson();

	}

}