package day3.shape;

public class Line extends Shape{
	
	private int style;
	
	// getter, setter
	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	// 생성자는 상속 X
	public Line() {	}
	
	public Line(int stX, int stY, int endX, int endY, int weight, int style) {
		super(stX, stY, endX, endY, weight);
		this.style = style;
		// TODO Auto-generated constructor stub
	}
	
	// 오버라이딩
	@Override
	public String toString() {
		return "Line [getStX()=" + getStX() + ", getStY()=" + getStY() + ", getEndX()=" + getEndX() + ", getEndY()="
				+ getEndY() + ", getWeight()=" + getWeight() + "]";
	}
	
	// 메서드 오버라이딩
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("선을 그리다.");
	}
	
	// 내 마음대로
	@Override
	public double getLength(int sX, int sY, int eX, int eY) {
		// TODO Auto-generated method stub
		double length = super.getLength(sX, sY, eX, eY);
		return length;
	}
	
	
	




}
