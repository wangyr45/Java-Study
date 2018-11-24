package ExampleDemo;

class Student {
	private String stuno;
	private String name;
	private float math;
	private float english;
	private float computer;
	public Student() {	//定义无参构造
		
	}
	//定义有5个参数的构造方法，为类中的属性初始化
	public Student(String stuno,String name,float math,float english,float computer) {
		this.setStuno(stuno);
		this.setName(name);
		this.setMath(math);
		this.setEnglish(english);
		this.setComputer(computer);
	}
	
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getComputer() {
		return computer;
	}
	public void setComputer(float computer) {
		this.computer = computer;
	}
	
	public float sun() {
		return math + english + computer;
	}
	public float avg() {
		return this.sun() / 3;
	}
	public float max() {
		float max = math;
		max = max > computer ? max : computer;
		max = max > english ? max : english;
		return max;
	}
	public float min() {
		float min = math;
		min = min < computer ? min : computer;
		min = min < english ? min : english;
		return min;
	}
	
}
