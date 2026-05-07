package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int i = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        return switch (i) {
            case 0 -> new Circle(random.nextDouble(100), color);
            case 1 -> new Square(random.nextDouble(100), color);
            case 2 -> new IsoscelesTrapezoid(
                    random.nextDouble(100),
                    random.nextDouble(100),
                    random.nextDouble(100),
                    color
            );
            case 3 -> new RightTriangle(random.nextDouble(100), random.nextDouble(100), color);
            default -> new Rectangle(random.nextDouble(100), random.nextDouble(100), color);
        };

    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
