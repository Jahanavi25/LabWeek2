package org.employee;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	private double baseSalary;
	
	//constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,Date birthDate, double grossSales,double commissionRate,double baseSalary){
		super(firstName, lastName, socialSecurityNumber,birthDate,grossSales,commissionRate);
		
		if(baseSalary<0.0) //validate
			throw new IllegalArgumentException();
		this.baseSalary=baseSalary;
		
	}
	//set base salary
	public void setBaseSalary(double baseSalary){
		if(baseSalary<0.0)
			throw new IllegalArgumentException();
		this.baseSalary = baseSalary;
		
	}
	
	//get base salary
	public double getBaseSalary(){
		return baseSalary ;
	}
	
	//overriding abstract methods
	@Override
	public double earnings()
	{
		return getBaseSalary()+super.earnings();
	}
	
	//string reprsentation of Base plus commission Employeee
	@Override
	public String toString()
	{
		return String.format("%s %s;%s:.2f", "base salary", super.toString(), "base salary", getBaseSalary());
	}
	
	
	

}
