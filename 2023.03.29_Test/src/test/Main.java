package test;

import java.util.Scanner;

public class Main {
	private Scanner in;
	private Point[] point;
	private double[] result;
	
	public Main() {
		in = new Scanner(System.in);
		
		point = new Point[3];
		
		result = new double[point.length];
	}
		
	private double[] calCenterOfGravity() {
		for (int i=0; i<point.length; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			point[i] = new Point(x, y);
		}
		
		int sum1 = 0;
		int sum2 = 0;
		for (int i=0; i<result.length; i++) {
			sum1 += point[i].getX();
			sum2 += point[i].getY();
		}
		result[0] = (double) sum1 / point.length;
		result[1] = (double) sum2 / point.length;
		
		return result;
	}
	
	public void printOf() {
		result = calCenterOfGravity();
		
		System.out.printf("(%.1f, %.1f)", result[0], result[1]);
	}
	
	public static void main(String[] args) {
		Main test = new Main();
		
		test.printOf();
	}
}
