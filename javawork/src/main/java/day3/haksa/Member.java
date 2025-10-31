package day3.haksa;
// 부모는 Object 상속
public class Member {

	int no;
	String name;
	String addr;
	String zip;

	public Member() {
		super();
	}
	
	public void update() {};
	public void delete() {};
	
	// 오버라이드 : 재정의
//	 Object object = null;
//	 object. // 오버라이딩해서
	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + "]";
	}
	
	

}