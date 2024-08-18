package entity;

public class Student {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String address;
    private String qq;
    private String email;
    
    
    

    public Student() {
		super();
	}



	public Student(String name, String gender, int age, String address, String qq, String email) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.qq = qq;
		this.email = email;
	}

	

	public Student(int id, String name, String gender, int age, String address, String qq, String email) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.qq = qq;
		this.email = email;
	}



	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", qq='" + qq + '\'' +
                ", email='" + email + '\'' +

                '}';
    }
}
