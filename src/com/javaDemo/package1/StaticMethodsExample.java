package com.javaDemo.package1;

public class StaticMethodsExample {
	public static void main(String[] args) {
		
		RemuneratorImpl rem=new RemuneratorImpl();
		Double pension = rem.deductForPension(20000);
		Double healthPremium= rem.deductHealthInsurancePremium(1000);
		
		System.out.println(pension);
		System.out.println(healthPremium);
	}

}

interface Remunerator {
	public abstract double deductFoodFee();

	final double HEALTH_INSURANCE_PERCENTAGE = 5.0;
	final double PENSION_PERCENTAGE = 5.0;

	public default double deductHealthInsurancePremium(double employeeSalary) {
		return (employeeSalary * HEALTH_INSURANCE_PERCENTAGE / 100);
	}

	public static double deductForPension(double employeeSalary) { // Static method of the interface
		return (employeeSalary * PENSION_PERCENTAGE / 100);
	}
	public void testFood();
}
class RemuneratorImpl implements Remunerator{

	@Override
	public double deductFoodFee() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
//	public double deductHealthInsurancePremium(double sal)
//	{
//		return 0;
//	}
	
	public double deductForPension(double sal)
	{
		return 0;
	}

	@Override
	public void testFood() {
		// TODO Auto-generated method stub
		
	}
	
}
