package day3.haksa;

public class Student extends Member {
	// 필드
	private int grade;
	
	// 생성자
	public Student() {};
	
	public Student(int no, String name, int grade) {
		this.grade = grade;
		this.no = no;
		this.name = name;
	}
	
	// getter, setter
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	// toString 오버라이딩
	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", grade=" + grade + "]";
	}
	
	// super.부모메소드() => 부모 메소드 호출
	@Override
	public void update() {
		// TODO Auto-generated method stub
		super.update();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
}
