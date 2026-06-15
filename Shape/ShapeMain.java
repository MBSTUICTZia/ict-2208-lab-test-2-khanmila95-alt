public class ShapeMain {
    public static void main(String[] args) {
        Shape rect = new Rectangle("Red", true, 4.0, 5.0);
        Shape circle = new Circle("Blue", false, 3.0);

        System.out.println(rect);
        System.out.println();
        System.out.println(circle);

        System.out.println("\n--- Downcast Check ---");
        Rectangle r = (Rectangle) rect;
        Circle c = (Circle) circle;
        System.out.println("Rectangle width=" + r.getWidth() + " length=" + r.getLength());
        System.out.println("Circle radius=" + c.getRadius());
    }
}

