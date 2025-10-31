package day3.shape;

public class Circle extends Shape{
	private String color;
	
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
		// TODO Auto-generated method stub
		System.out.println("원을 그리다.");
	}

	// 내 마음대로
	@Override
	public double getLength(int sX, int sY, int eX, int eY) {
		// TODO Auto-generated method stub
		double length = super.getLength(sX, sY, eX, eY);
		return Math.PI * length * length;
	}
	
}
