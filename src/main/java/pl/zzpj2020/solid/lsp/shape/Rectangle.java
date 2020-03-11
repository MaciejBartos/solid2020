package pl.zzpj2020.solid.lsp.shape;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double circumference() {
        return 2 * a + 2 * b;
    }
}
