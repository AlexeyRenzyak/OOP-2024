public class Sphere extends Shape3D{
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double volume() {
        return (4*Math.PI*radius*radius*radius)/3;
    }
    @Override
    public double surfaceArea() {
        return 4*Math.PI*radius*radius;
    }
}
