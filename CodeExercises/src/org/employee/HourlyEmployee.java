package org.employee;

public class HourlyEmployee extends Employee{
	
	private double wage;
	private double hours;
	
	//constructor
	public HourlyEmployee(String firstName,String lastName, String socialSecurityNumber,Date birthDate, double wage, double hours){
		
		super(firstName,lastName,socialSecurityNumber,birthDate);
		
		if(wage<0.0) // validating the wage
			throw new IllegalArgumentException("hourly wage must be >=0.0");
		
		if(hours<0.0) //validating hours
	         throw new	IllegalArgumentException("hourly wage must be >=0.0");
		this.wage = wage;
		this.hours = hours;
	}
	// set wage
	public void setWage(double wage){
		
		if(wage<0.0) // validating the wage
			throw new IllegalArgumentException("hourly wage must be >=0.0");
		this.wage = wage;
		
		
	}
	//return wage
	public double getWage(){
		return wage;
	}
	
	// set hours
	public void setSours(double hours){
		if(hours<0.0) //validating hours
	         throw new	IllegalArgumentException("hourly wage must be >=0.0");
		this.hours=hours;
		
	}
	// return wage
	public double getHours(){
		return wage;
	}
	
	//overriding abstract methods
	@Override
	public double earnings(){
		if(getHours()<=40)
			return getWage() * getHours();
		else
				return 40* getWage()+(getHours()-40)*getWage()*1.5;
			
		}
	//String represntation of hourly employed object
	@Override
	public String toString()
	{
		return String.format("hourly employee", super.toString());
	}

}
