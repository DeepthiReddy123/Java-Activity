public class Square extends Shape {
    private final double width; //sides

    public Square() {
        this(1);
    }
    public Square(double width) {
        this.width = width;
        
    }

    @Override
    public  double area() {
        // A = w * l
        return width*width;
    }

    
}