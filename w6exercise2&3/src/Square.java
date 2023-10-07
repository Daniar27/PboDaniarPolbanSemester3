public class Square extends Reactangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }

    public  Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString(){
        return "A Square with side="+getSide()+", which is a subclass of "+super.toString();
    }
}
