package entity;

public class Course {
	private String id;
	private String name;
	
	public Course(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
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
	@Override
	public String toString() {
		return "Course [课程代码=" + id + ", 课程名称=" + name + "]";
	}

}
