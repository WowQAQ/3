package cn.hnust;

public class Question {

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String id;
	public String name;
	public int age;
	public String dept;
	public String address;
	
	public Question() {
		
	}
	public Question(String id, 
			String name, int age, 
			String dept, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.address = address;
	}
	public static void main(String[] args) {
		
		

	}

}
