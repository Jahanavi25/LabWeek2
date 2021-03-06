package org.employee;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;
	
	//constructor
	public CommissionEmployee(String firstName, String lastName, String socialSecurtiyNumber,Date birthDate, double grossSales, double commissionRate){
		super(firstName, lastName, socialSecurtiyNumber,birthDate);
		
		if(commissionRate<=0.0 ||commissionRate>=1.0) //validating
			throw new IllegalArgumentException();
		this.commissionRate = commissionRate;
		
		if(grossSales<0.0) //validate
			throw new IllegalArgumentException();
		
		this.grossSales= grossSales;
		this.commissionRate = commissionRate;
	}
		
	//setting gross sales amount
		public void setGrossSales(double grossSales){
			if(grossSales<0.0)
				throw new IllegalArgumentException();
			this.grossSales = grossSales;
		}
		
		//return gross sales amount
		public double getGrossSales(){
			return grossSales;
		}
			
		//set commision rate	
	     public void setCommissionRate(double commissionRate){
				if(commissionRate<0.0)
					throw new IllegalArgumentException();
				this.commissionRate = commissionRate;
	     }
	     
	     //return commissionrate
	     public double getCommissionRate(){
				return commissionRate;
			}
	
	     //overriding abstract methods
	@Override
	public double earnings(){
		return getGrossSales()*getCommissionRate();
	}
	
	
	//returning string representation of CommissionEmployee
	@Override
	public String toString()
	{
		return "Employee details: \nfirst name:"+getFirstName()+"\nlast name:"+getFirstName()+"\nssn:"+getSocialSecurityNumber()+"\ngross sale:"+grossSales+"\n commisionrate"+commissionRate+"\nearnings:"+earnings();
	}
	
	
	
	
}
