package MiniProjects;


class Employee
{
	int Emp_No,Basic,HRA,IT;
	String Emp_Name;
	String Join_Date;
	String Designation_Code;
	String Department;
	Employee(int Emp_No,String Emp_Name,String Join_Date,String Designation_Code,String Department,int Basic,int HRA,int IT)
	{
		this.Emp_No=Emp_No;
		this.Emp_Name=Emp_Name;
		this.Join_Date=Join_Date;
		this.Designation_Code=Designation_Code;
		this.Department=Department;
		this.Basic=Basic;
		this.HRA=HRA;
		this.IT=IT;
	}
}
class Designation
{
	String Designation_Code,Designation;
	int DA;
	Designation(String Designation_Code,String Designation,int DA)
	{
		this.Designation_Code=Designation_Code;
		this.Designation=Designation;
		this.DA=DA;
	}
}

class Project_1
{
	public static void main(String args[])
	{
		int i;
		Employee[] emp;
		emp = new Employee[7];
		emp[0]=new Employee(1001,"Ashish","01/04/2009","e","R&D",20000,8000,3000);
		emp[1]=new Employee(1002,"Sushma","23/08/2012","c","PM",30000,12000,9000);
		emp[2]=new Employee(1003,"Rahul","12/11/2008","k","Acct",10000,8000,1000);
		emp[3]=new Employee(1004,"Chahat","29/01/2013","r","Front Desk",12000,6000,2000);
		emp[4]=new Employee(1005,"Ranjan","16/07/2005","m","Engg",50000,20000,20000);
		emp[5]=new Employee(1006,"Suman","1/1/2000","e","Manfacturing",23000,9000,4400);
		emp[6]=new Employee(1007,"Tanmay","12/06/2006","c","PM",29000,12000,10000);

		Designation[] des;
		des=new Designation[5];
		des[0]=new Designation("e","Engineer",20000);
		des[1]=new Designation("c","Consultant",32000);
		des[2]=new Designation("k","Clerk",12000);
		des[3]=new Designation("r","Receptionist",15000);
		des[4]=new Designation("m","Manager",40000);
	
		int Given_No=Integer.parseInt(args[0]);
		String Designation_Name="";
		int DA_amnt,Salary=0;

		for(i=0;i<emp.length;i++)
		{
			if(Given_No==emp[i].Emp_No)
			{
				switch(emp[i].Designation_Code)
				{
					case "e":
						Designation_Name=des[0].Designation;
						DA_amnt=des[0].DA;
						break;
					case "c":
						Designation_Name=des[1].Designation;
						DA_amnt=des[1].DA;
						break;
					case "k":
						Designation_Name=des[2].Designation;
						DA_amnt=des[2].DA;
						break;
					case "r":
						Designation_Name=des[3].Designation;
						DA_amnt=des[3].DA;
						break;
					case "m":
						Designation_Name=des[4].Designation;
						DA_amnt=des[4].DA;
						break;
					default:
						Designation_Name="No Name";
						DA_amnt=0;
				}
				Salary=emp[i].Basic+emp[i].HRA+DA_amnt-emp[i].IT;
				System.out.println("Emp_No\tEmp_Name\tDepartment\tDesignation\tSalary");
				System.out.println(emp[i].Emp_No+"\t"+emp[i].Emp_Name+"\t\t"+emp[i].Department+"\t\t"+Designation_Name+"\t\t"+Salary);	
			}
			if(Salary>0)
				break;
		}
		if(i==emp.length)
			System.out.println("There is no Employee with empid: "+Given_No);
	}
}

