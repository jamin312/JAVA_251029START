package day3.shape;

public class Tri extends Shape{
	private String color; // 면 색상
	
	// getter, setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// 오버라이딩
	@Override
	public String toString() {
		return "Line [getStX()=" + getStX() + ", getStY()=" + getStY() + ", getEndX()=" + getEndX() + ", getEndY()="
				+ getEndY() + ", getWeight()=" + getWeight() + ", getColor=" + getColor() + "]";
	}

	@Override
	public void draw() {
		System.out.println("삼각형을 그리다.");
	}
	
	
	
	
}
