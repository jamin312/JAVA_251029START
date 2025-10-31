package day3.shape;

public abstract class Shape {
	private int stX;
	private int stY;
	private int endX;
	private int endY;
	private int weight; // 선의 굵기
	
	// 추상 메서드
	public abstract void draw() ;
	
	
	// 생성자
	// super() 는 부모의 기본 생성자를 호출한다.
	public Shape() {};
	
	public Shape(int stX, int stY, int endX, int endY, int weight) {
		super();
		this.stX = stX;
		this.stY = stY;
		this.endX = endX;
		this.endY = endY;
		this.weight = weight;
	}
	
	// getter, setter
	public int getStX() {
		return stX;
	}
	public void setStX(int stX) {
		this.stX = stX;
	}
	public int getStY() {
		return stY;
	}
	public void setStY(int stY) {
		this.stY = stY;
	}
	public int getEndX() {
		return endX;
	}
	public void setEndX(int endX) {
		this.endX = endX;
	}
	public int getEndY() {
		return endY;
	}
	public void setEndY(int endY) {
		this.endY = endY;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// 오버라이딩
	@Override
	public String toString() {
		return "Shape [stX=" + stX + ", stY=" + stY + ", endX=" + endX + ", endY=" + endY + ", weight=" + weight + "]";
	}
	
	// 내 마음대로
	public double getLength(int sX, int sY, int eX, int eY) {
		return Math.sqrt(Math.pow((eX - sX), 2) + Math.pow((eY - sY), 2));
		
	}
	
	
	
}
