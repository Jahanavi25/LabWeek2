package org.employee;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PayRollSystemTest {

	public static void main(String[] args) {
		
		
		//creating sub class objects
		SalariedEmployee salariedemployee = new SalariedEmployee("John","Smith","111-11-1111",new Date(9,25,1993),800.0);
		HourlyEmployee hourlyemployee = new HourlyEmployee("Karen","Price","222-22-2222",new Date(10,25,1993),900.0,40);
		
		CommissionEmployee commissionemployee = new CommissionEmployee("jahn","L","333-33-333",new Date(11,25,1993),1000.0,.06);
		
		BasePlusCommissionEmployee basepluscommissionemployee = new BasePlusCommissionEmployee("bob","L","444-44-444",new Date(12,25,1993),1800.0,.04,300);
		
		PieceWorker pieceworker = new PieceWorker("julee","hong", "555-55-555",new Date(12,25,1993) , 1200, 10);
		System.out.println("Employees processes individually");
		//System.out.printf("%n%s%n%s: $%,.2f%n%n", SalariedEmployee,"earned",SalariedEmployee.earnings());

		//creating employee array
		
		Employee[] employees = new Employee[5];
		
		//intializing array with employees 
		employees[0] = salariedemployee;
		employees[1] = hourlyemployee;
	    employees[2] = commissionemployee;
		employees[3] = basepluscommissionemployee;
		employees[4]= pieceworker;
		
		System.out.println("employees processed polymorphically");
		Calendar cal = Calendar.getInstance();
		System.out.println(new SimpleDateFormat("MM").format(cal.getTime()));
		int currentMonth = Integer.parseInt(new SimpleDateFormat("MM").format(cal.getTime()));
		
		//processing each element into the array
		for(Employee currentemployee:employees){
			
			/*if(currentemployee.getBirthDate().getMonth()==currentMonth)
		System.out.println("current earnings"+(currentemployee.earnings()+100));
			else
				System.out.println("current earnings"+currentemployee.earnings());
				*/
			System.out.println(currentemployee.toString());
		}
	}

}
