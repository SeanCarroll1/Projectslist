package ForFun;

//Employee Object containing firstname , lastname and monthly salary of the employee.
class Employee
{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	Employee(String f, String l, double salary)
	{
		firstName=f;
		lastName=l;
		monthlySalary=salary;
	}
	//Getters and Setters.
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public double getSalary()
	{
		return monthlySalary;
	}
	
	public void setSalary(double s)
	{
		if(s>0)
		{
			monthlySalary=s;
		}else
		{
			monthlySalary=0.0;
		}
		
	}
	
	public void setFirstName(String n)
	{
		firstName=n;
	}
	
	public void setLastName(String n)
	{
		lastName=n;
	}
}

public class EmployeeTest 
{
	public static void main(String [] args)
	{
		Employee test= new Employee("Sean", "Carroll", 5000);
		
		System.out.println(test.getFirstName() + "s monthly Salary is " + test.getSalary());
	}
}
