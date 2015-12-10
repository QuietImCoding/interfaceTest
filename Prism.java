public class Prism extends Rectangle implements Volume{

    private double height;

    public Prism(double length, double width, double height, String name){
	super(length,width,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public double getVolume() {
	return getHeight() * getWidth() * getLength();
    }

    public String toString(){
	return "Height: " + getHeight() + "\nWidth: " + getWidth() + "\nLength: " + getLength();
    }
}
