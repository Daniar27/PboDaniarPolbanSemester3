public class Reactangle extends Shape{
    private double width;
    private double length;

    public Reactangle(){
        width = 1.0;
        length = 1.0;
    }

    public Reactangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    public Reactangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString(){
        return "A Rectangle with width="+width+" and length="+length+", which is a subclass of "+super.toString();
    }
}
