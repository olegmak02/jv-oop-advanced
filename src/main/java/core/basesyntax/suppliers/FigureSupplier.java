package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.FigureType;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final double MAX_SIZE = 100;
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int i = RANDOM.nextInt(FigureType.values().length);
        String color = colorSupplier.getRandomColor();

        return switch (FigureType.values()[i]) {
            case CIRCLE -> new Circle(RANDOM.nextDouble(MAX_SIZE), color);
            case SQUARE -> new Square(RANDOM.nextDouble(MAX_SIZE), color);
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(
                    RANDOM.nextDouble(MAX_SIZE),
                    RANDOM.nextDouble(MAX_SIZE),
                    RANDOM.nextDouble(MAX_SIZE),
                    color
            );
            case RIGHT_TRIANGLE -> new RightTriangle(
                    RANDOM.nextDouble(MAX_SIZE),
                    RANDOM.nextDouble(MAX_SIZE),
                    color
            );
            case RECTANGLE -> new Rectangle(
                    RANDOM.nextDouble(MAX_SIZE),
                    RANDOM.nextDouble(MAX_SIZE),
                    color
            );
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
