package practice;

public class Empolyee {
	private int empid;
	private String ename;
	private String job;
	private String dname;
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Empolyee() {
		// TODO Auto-generated constructor stub
		empid=12;
		ename="Aswini";
		job="Analyst";
		dname="development";
		address =new Address();
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	

}
