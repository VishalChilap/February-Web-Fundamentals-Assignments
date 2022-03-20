package AssignementMar15;
class Employee {
	String id;
	String name;
	String department;
	String worklocation;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getWorklocation() {
		return worklocation;
	}
	public void setWorklocation(String worklocation) {
		this.worklocation = worklocation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", worklocation=" + worklocation
				+ "]";
	}
	
	
}
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.department="Training";
		e1.name="AAA";
		e1.id="111";
		e1.worklocation="Pune";
		System.out.println(e1);
		
		Employee e2 = new Employee();
		e2.department="Training";
		e2.name="BBB";
		e2.id="222";
		e2.worklocation="Mumbai";
		System.out.println(e2);
		
		Employee e3 = new Employee();
		e3.department="Training";
		e3.name="CCC";
		e3.id="333";
		e3.worklocation="Delhi";
		System.out.println(e3);
		
		Employee e4 = new Employee();
		e4.department="Training";
		e4.name="DDD";
		e4.id="444";
		e4.worklocation="Gurgaon";
		System.out.println(e4);


	}

}
