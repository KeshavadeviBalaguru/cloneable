package cloneable;

public class Priya implements Cloneable
{
	int age;
	String name;
	String college;
	
	
	public Priya()
	{
		age=23;
		name="Priyadharshini";
		college="PKIET";
		
		
	}
	public void getDetails()
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(college);
	}

	public static void main(String[] args)throws CloneNotSupportedException
	{
		Priya p=new Priya();
		p.getDetails();
		System.out.println("-------------");
		Priya p1=(Priya)p.clone();
		p1.getDetails();
				
		// TODO Auto-generated method stub

	}

}
