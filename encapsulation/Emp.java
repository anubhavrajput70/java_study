package encapsulation;

public class Emp {
	private int empid;
	public void setEmpId(int empid1)
	{
		empid=empid1;
	}
	public int getEmpId()
	{
		return empid;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp();
		e.setEmpId(1999);
		System.out.println(e.getEmpId());
	}

}
