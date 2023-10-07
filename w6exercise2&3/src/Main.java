import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        System.out.println("Circle:"
                + " radius=" + c.getRadius()
                + " base area=" + c.getArea()
                + " perimeter=" + c.getPerimeter()
                + " toString="+c);

        Reactangle r = new Reactangle(4,3, "blue", true);
        System.out.println("Rectangle:"
                + " length=" + r.getLength()
                + " width=" + r.getWidth()
                + " base area=" + r.getArea()
                + " perimeter=" + r.getPerimeter()
                + " toString="+r);

        Square s = new Square();
        System.out.println("Square:"
                + " side=" + s.getSide()
                + " toString="+s);
    }
}