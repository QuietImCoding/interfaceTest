public class Cylinder extends Circle implements Volume{

    private double height;

    public Cylinder(double radius, double height,String name){
	super(radius,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public double getVolume() {
	return Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }
    
    public String toString(){
	return "Radius: " + getRadius() + "\nHeight: " + getHeight();
    }
}
