public class Paint {
    private double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape shape){
        System.out.println("Computing amout for "+ shape);
        return shape.area()/coverage;
    }

}