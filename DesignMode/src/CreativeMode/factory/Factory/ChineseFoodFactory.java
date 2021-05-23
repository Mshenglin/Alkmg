package CreativeMode.factory.Factory;

import CreativeMode.factory.dto.Chicken;
import CreativeMode.factory.dto.Food;
import CreativeMode.factory.dto.Noodle;

/**
 * 中国食物工厂
 * @author mashenglin
 */
public class ChineseFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if(name.equals("noodle")){
            Food noodle=new Noodle();
            return noodle;
        }
        else if(name.equals("chilken")){
            Food chicken=new Chicken();
            return chicken;
        }
        else {
            return null;
        }
    }
    }
