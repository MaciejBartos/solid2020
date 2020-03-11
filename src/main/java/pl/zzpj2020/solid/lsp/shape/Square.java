package pl.zzpj2020.solid.lsp.shape;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double circumference() {
        return 4 * a;
    }
}
