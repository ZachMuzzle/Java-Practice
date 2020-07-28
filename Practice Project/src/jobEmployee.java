
public class jobEmployee {

	private String name;
	private String gender;
	private int age;

	public jobEmployee(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Employee: Name= " + this.name + " Age= " + this.age + " Gender= " + this.gender;
	}
}
