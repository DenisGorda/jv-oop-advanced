package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
