package java07_inheritance.practice.controller;

import java07_inheritance.practice.model.Circle;
import java07_inheritance.practice.model.Point;
import java07_inheritance.practice.model.Rectangle;

public class Main {
	public static void main(String[] args) {
		
		Circle[] circles = new Circle[3];
		
		circles[0] = new Circle();
		circles[1] = new Circle(1, 1, 1);
		circles[2] = new Circle(2, 2, 2);
		
		for(int i=0; i<circles.length; i++) {
			circles[i].draw();
			System.out.println("----------");
		}

		System.out.println("= = = = = = = = = = = = = =");

		Rectangle[] rectangles = new Rectangle[3];
		rectangles[0] = new Rectangle();
		rectangles[1] = new Rectangle(10,10,10,20);
		rectangles[2] = new Rectangle(30,21,12,34);

		for(int i=0; i<rectangles.length; i++) {
			rectangles[i].draw();
			System.out.println("----------");
		}
		
		System.out.println("= = = = = = = = = = = = = =");
		
		Point[] points = new Point[5];
		
		points[0] = new Circle(); 
		points[1] = new Rectangle(); 
		points[2] = new Circle(2,3,6); 
		points[3] = new Rectangle(4,7,12,3); 
		points[4] = new Rectangle(7,5,3,7); 
		
		for(int i=0; i<points.length; i++) {
			points[i].draw();
			System.out.println("----------");
		}
		
	}
}




















