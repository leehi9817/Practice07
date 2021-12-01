package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//추상클래스는 객체를 가질 수 없다
		//Shape s = new Shape("빨강");
		
		Shape s = new Circle("빨강", 10);
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		
		//sr1의 가로크기 출력
		//getWidth 메소드에 접근하기 위해 형변환 한다
		System.out.println(((Ractangle)sr1).getWidth());
	}
}

	
	