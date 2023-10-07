public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled){
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString() {
        return "A Shape with color of " + color+ " and " +(filled?"filled":"notFilled");
    }
}
