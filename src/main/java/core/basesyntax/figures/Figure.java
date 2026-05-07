package core.basesyntax.figures;

public abstract class Figure {
    protected String color;
    protected final String BASIC_PRINT_INFO = "Figure: %s, area: %.1f sq. units, color: %s";

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {}

    public abstract double getArea();
    public abstract void draw();
}
