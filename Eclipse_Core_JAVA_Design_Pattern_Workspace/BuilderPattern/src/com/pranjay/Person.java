package com.pranjay;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String street1;
	private String street2;
	private String city;
	private int postCode;
	private boolean married;
	private String employmentType;
	private Person(PersonBuilder personBuild) {
		this.firstName = personBuild.firstName;
		this.lastName = personBuild.lastName;
		this.age = personBuild.age;
		this.street1 = personBuild.street1;
		this.street2 = personBuild.street2;
		this.city = personBuild.city;
		this.postCode = personBuild.postCode;
		this.married = personBuild.married;
		this.employmentType = personBuild.employmentType;
	}

	public static class PersonBuilder {

		private String firstName;
		private String lastName;
		private int age;
		private String street1;
		private String street2;
		private String city;
		private int postCode;
		private boolean married;
		private String employmentType;

		PersonBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public PersonBuilder setStreet1(String street1) {
			this.street1 = street1;
			return this;
		}

		public PersonBuilder setStreet2(String street2) {
			this.street2 = street2;
			return this;
		}

		public PersonBuilder setPostCode(int postCode) {
			this.postCode = postCode;
			return this;
		}

		public PersonBuilder setMarried(boolean married) {
			this.married = married;
			return this;
		}

		public PersonBuilder setEmploymentType(String employmentType) {
			this.employmentType = employmentType;
			return this;
		}

		public Person buildPerson() {
			return new Person(this);
		}

		
	}

}
