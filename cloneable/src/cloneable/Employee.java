package cloneable;

public class Employee implements Cloneable
{
	int id;
	String name;
	double salary;
	
	public Employee()
	{
		id=111;
		name="Manikandan";
		salary=56789.33;
	}
	
	public void getInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employee e=new Employee();
		e.getInfo();
		
		System.out.println("-----------");
		Employee e1=(Employee) e.clone();
		e1.getInfo();
		// TODO Auto-generated method stub

	}

}
