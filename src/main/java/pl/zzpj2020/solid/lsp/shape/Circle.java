package pl.zzpj2020.solid.lsp.shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
