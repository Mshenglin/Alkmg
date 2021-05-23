package CreativeMode.factory.SimpleFacory;

import CreativeMode.factory.dto.Chicken;
import CreativeMode.factory.dto.Food;
import CreativeMode.factory.dto.Noodle;

/**
 * 简单工厂模式
 * @author mashenglin
 */
public class SimpleFactory {
    public static Food makeFood(String name){
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
