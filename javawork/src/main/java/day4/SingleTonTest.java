package day4;
/*
 * 싱글톤 - 객체 관리 => 메모리 관리를 위해서
 * */
public class SingleTonTest {
	
	public static void main(String[] args) {
		
		// Dept 클래스의 유일한 인스턴스를 얻는다 (항상 같은 객체를 돌려줌)
		Dept dept1 = Dept.getInstance();
		Dept dept2 = Dept.getInstance();
		
		// '=='는 두 참조가 같은 객체(같은 주소)를 가리키는지 비교
		System.out.println(dept1 == dept2);
		
	} // end main
}// end class

class Dept {
	
	// 클래스가 로딩될 때 단 한 번 생성되는 유일한 인스턴스
    // JVM의 클래스 로딩은 스레드-세이프하므로 여기서의 생성은 안전함
	private static Dept instance = new Dept();
	
	// 외부에서 생성자를 호출하지 못하도록 막음
	private Dept() {}
	
	// getter
	public static Dept getInstance() {
		// 항상 같은 인스턴스를 반환
		return instance;
	};
	
	
	
} // end class

