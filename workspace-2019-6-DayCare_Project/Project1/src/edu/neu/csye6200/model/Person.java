package edu.neu.csye6200.model;

public class Person {
private int id;
private String firstName;
private String lastName;
private int age;
private ImmunizationRecord immunizationRecord;

public Person(int id, String firstName, String lastName, int age) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.immunizationRecord = new ImmunizationRecord(id);
}

// To get back 
public Person(String csvData) {
	
}

// To create student objects using string
public void createPersonUsingString(String stringData) {
	String[] args = stringData.split(",");
	 int id = Integer.parseInt(args[0]);
	 String firstName = args[1];
	 String lastName = args[2];
	 int age = Integer.parseInt(args[3]);
	 
	 new Person(id,firstName,lastName,age);
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public ImmunizationRecord getImmunizationRecord() {
	return immunizationRecord;
}
public void setImmunizationRecord(ImmunizationRecord immunizationRecord) {
	this.immunizationRecord = immunizationRecord;
}


}
