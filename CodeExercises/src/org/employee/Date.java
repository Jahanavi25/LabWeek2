package org.employee;

public class Date {
	private int month;
	private int day;
	private int year;
	
	private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,30,31,30,31,30,31};
	
	public Date(int month, int day, int year){
		this.month=month;
		
		
	}

	public int getMonth() {
		return month;
	}

	

	public int getDay() {
		return day;
	}



	public int getYear() {
		return year;
	}


	
  

}
