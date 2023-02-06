package methodoverloading;

public class Tester {

	public static void main(String[] args) {
		point p1 =new point(2,3);
		point p2= new point(5,6);
		double distance=p1.distance(p2);
		double distance2 =p1.distance();
		System.out.println("The distance of p1 from origin is"+distance2);
		System.out.println("The distance of p1 from p2 is"+distance);

	}

}
