public abstract class Shape {
    protected String shape;

    public Shape(String shape) {
        this.shape = shape;
    }

    public abstract double calculateShape();
    public abstract double calculatePerimeter();
}
