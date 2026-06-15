public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "[ Circle ]\n" +
               "Color : " + color + "\n" +
               "Filled: " + (filled ? "Yes" : "No") + "\n" +
               "Radius: " + radius + "\n" +
               String.format("Area : %.2f\n", getArea()) +
               String.format("Circumference: %.2f\n", getPerimeter());
    }

    
    public double getRadius() { return radius; }
}
