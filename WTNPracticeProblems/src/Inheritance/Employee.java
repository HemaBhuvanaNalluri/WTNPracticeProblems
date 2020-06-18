package Inheritance;

public class Employee extends Person
{
	private double annual_sal;
	private int year;
	private String national_insu_num;
	public double getAnnual_sal() {
		return annual_sal;
	}
	public void setAnnual_sal(double annual_sal) {
		this.annual_sal = annual_sal;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getNational_insu_num() {
		return national_insu_num;
	}
	public void setNational_insu_num(String national_insu_num) {
		this.national_insu_num = national_insu_num;
	}
	
}
