package Inheritance;

public class Program2 
{
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.setName("Ram");
		e.setAnnual_sal(10000.00);
		e.setNational_insu_num("12345@12");
		e.setYear(2000);
		System.out.println("Employee Details:");
		System.out.println("Employee Name:"+e.getName());
		System.out.println("Employee Salary:"+e.getAnnual_sal());
		System.out.println("Employee Insurance Num:"+e.getNational_insu_num());
		System.out.println("Employee work starting year:"+e.getYear());
		
	}
}
