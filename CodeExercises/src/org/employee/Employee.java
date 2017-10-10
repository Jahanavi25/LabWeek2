package org.employee;

public abstract class Employee {
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private Date birthDate;
	
	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

    //constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate){
		this.firstName= firstName;
		this.lastName=lastName;
		this.socialSecurityNumber= socialSecurityNumber;
		this.birthDate = birthDate;
	}
	
   //return firstname
	public String getFirstName() {
		return firstName;
	}

	//return lastname
	public String getLastName() {
		return lastName;
	}

	//return social security number
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	//returning string representation of employee object
	@Override
	public String toString(){
		return String.format("%s%s %n social security number: %s",getFirstName(),getLastName(),getSocialSecurityNumber());
	}
	
	//abstract method
	public abstract double earnings();
	
	

}
