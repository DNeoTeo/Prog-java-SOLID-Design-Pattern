package exercice2;
import exercice2.builder.*;
import exercice2.materiau.*;

public class StrategyPatternTest {
    public static void main(String [] args) {
        Builder builder = new AmericanHouseBuilder();
        builder.startBuilding();

        builder.setMaterial(new RedBrick());
        builder.startBuilding();
    }
}
