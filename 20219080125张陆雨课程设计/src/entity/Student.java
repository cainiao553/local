package entity;

public class Student {
	private String 姓名;
	private String 学号;
	private char 性别;
	private int 年龄;
	private float 身高;
	private double 体重;
	private String 电话;
	private String 籍贯;
	private int 年级;
	private boolean 毕业;
	public Course[] 课程=new Course[10];
	public Student(String 姓名, String 学号, char 性别, int 年龄, float 身高, double 体重, String 电话, String 籍贯, int 年级,
			boolean 毕业) {
		super();
		this.姓名 = 姓名;
		this.学号 = 学号;
		this.性别 = 性别;
		this.年龄 = 年龄;
		this.身高 = 身高;
		this.体重 = 体重;
		this.电话 = 电话;
		this.籍贯 = 籍贯;
		this.年级 = 年级;
		this.毕业 = 毕业;
	}

	@Override
	public String toString() {
		return "Student [姓名=" + 姓名 + ", 学号=" + 学号 + ", 性别=" + 性别 + ", 年龄=" + 年龄 + ", 身高=" + 身高 + ", 体重=" + 体重 + ", 电话="
				+ 电话 + ", 籍贯=" + 籍贯 + ", 年级=" + 年级 + ", 毕业=" + 毕业 + "]";
	}

	public String get姓名() {
		return 姓名;
	}

	public void set姓名(String 姓名) {
		this.姓名 = 姓名;
	}

	public String get学号() {
		return 学号;
	}

	public void set学号(String 学号) {
		this.学号 = 学号;
	}

	public char get性别() {
		return 性别;
	}

	public void set性别(char 性别) {
		this.性别 = 性别;
	}

	public int get年龄() {
		return 年龄;
	}

	public void set年龄(int 年龄) {
		this.年龄 = 年龄;
	}

	public float get身高() {
		return 身高;
	}

	public void set身高(float 身高) {
		this.身高 = 身高;
	}

	public double get体重() {
		return 体重;
	}

	public void set体重(double 体重) {
		this.体重 = 体重;
	}

	public String get电话() {
		return 电话;
	}

	public void set电话(String 电话) {
		this.电话 = 电话;
	}

	public String get籍贯() {
		return 籍贯;
	}

	public void set籍贯(String 籍贯) {
		this.籍贯 = 籍贯;
	}

	public int get年级() {
		return 年级;
	}

	public void set年级(int 年级) {
		this.年级 = 年级;
	}

	public boolean is毕业() {
		return 毕业;
	}

	public void set毕业(boolean 毕业) {
		this.毕业 = 毕业;
	}

	public Course[] get课程() {
		return 课程;
	}

	

}
