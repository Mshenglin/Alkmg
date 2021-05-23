package CreativeMode.factory.Factory;

import CreativeMode.factory.dto.Chicken;
import CreativeMode.factory.dto.Food;
import CreativeMode.factory.dto.Noodle;

/**
 * 美国食物工厂
 *
 * @author mashenglin
 */
public class AmericanFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if (name.equals("A")) {
            Food noodle = new Noodle();
            return noodle;
        } else if (name.equals("" +
                "b")) {
            Food chicken = new Chicken();
            return chicken;
        } else {
            return null;
        }
    }
}

