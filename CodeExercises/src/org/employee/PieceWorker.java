package org.employee;

public class PieceWorker extends Employee {
	
	private double wage;
	private int pieces;
	
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, int pieces){
		super(firstName, lastName, socialSecurityNumber, birthDate);
		
		this.wage= wage;
		this.pieces=pieces;
	}

	@Override
	public double earnings() {
		
		return pieces*wage;
	}
	
	@Override
	public String toString()
	{
		return "Employee details: \nfirst name:"+getFirstName()+"\nlast name:"+getFirstName()+"\nssn:"+getSocialSecurityNumber()+"\npieces worked:"+pieces+"\nwage per piece:"+wage+"\nearnings:"+earnings();
	}
	
	

}
