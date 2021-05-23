package CreativeMode.factory.Factory;

import CreativeMode.factory.dto.Food;

/**
 * @author mashenglin
 */
public interface FoodFactory {
    /**
     * 创键食物的类
     * @param name
     * @return food
     */
    Food makeFood(String name);
}
