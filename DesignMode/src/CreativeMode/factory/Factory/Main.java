package CreativeMode.factory.Factory;

import CreativeMode.factory.Factory.ChineseFoodFactory;
import CreativeMode.factory.Factory.FoodFactory;
import CreativeMode.factory.dto.Food;

/**
 * 通过创建不同的工厂生产不同的食物
 * @author mashenglin
 */
public class Main {
    public static void main(String[] args) {
        FoodFactory factory=new ChineseFoodFactory();
         Food noodle = factory.makeFood("noodle");
        System.out.println(noodle);
    }
}
