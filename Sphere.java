public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public double getVolume() {
	return 4 * Math.PI * Math.pow(getRadius(), 2) / 3.0;
    }
    
    public String toString(){
	return "Radius: " + getRadius();
    }
}
