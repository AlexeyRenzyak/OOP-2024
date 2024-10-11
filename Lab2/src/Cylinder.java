public class Cylinder extends Shape3D {
    private double radius, height;

    public Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public void setRadius(double r) {
        this.radius = r;
    }
    public void setHeight(double h) {
        this.height = h;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    @Override
    public double surfaceArea() {
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * height * radius);
    }
}