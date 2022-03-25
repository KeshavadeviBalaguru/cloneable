package cloneable;

public class Student implements Cloneable
{
	String name;
	int rollNo;
	
	public Student()
	{
		name="Praveen";
		rollNo=101;
	}
	
	public void getDetails()
	{
		System.out.println(name);
		System.out.println(rollNo);
	}

	public static void main(String[] args)throws CloneNotSupportedException
	{
		Student s=new Student();
		s.getDetails();
		
		System.out.println("-------------");
		Student s1=(Student) s.clone();
		s1.getDetails();
		// TODO Auto-generated method stub

	}

}
