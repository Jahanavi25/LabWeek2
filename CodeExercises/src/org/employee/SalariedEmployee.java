package org.employee;

public class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	//constructor
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,Date birthDate, double weeklySalary){
		super(firstName,lastName, socialSecurityNumber,birthDate);
		
		if(weeklySalary<0.0)
			throw new IllegalArgumentException();
		this.weeklySalary = weeklySalary;
	}
	
	
	//setSalary
	
	public void setSalary(double weeklySalary){
		if(weeklySalary<0.0)
			throw new IllegalArgumentException();
		this.weeklySalary = weeklySalary;
		
	}
	
	public double getweeklySalary(){
		return weeklySalary;
	}
	
	//calculate earnings ; override abstract methods 
	@Override
	public double earnings(){
		return weeklySalary;
	}
	
	//string representation of salaried employee object
	@Override
	public String toString()
	{
		return "Employee details: \nfirst name:"+getFirstName()+"\nlast name:"+getFirstName()+"\nssn:"+getSocialSecurityNumber()+"\nweekly salary:"+weeklySalary+"\nearnings:"+earnings();
	}
	

}
