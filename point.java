package methodoverloading;

public class point {
double x;
double y;
    point(double x,double y){
    	this.x=x;
    	this.y=y;
    }
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	public double distance(point p) {
		return Math.sqrt((this.getX() - p.getX()) * (this.getX() - p.getX())+ (this.getY() - p.getY()) * (this.getY() - p.getY()));

	}
      public double distance() {
    	  return Math.sqrt((this.getX() - 0) * (this.getX() - 0)+ (this.getY() - 0) * (this.getY() - 0));

      }
	
}
