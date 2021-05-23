package CreativeMode.Builder;

import CreativeMode.Builder.dto.User;

/**
 * @author mashenglin
 */
public class Main {
    public static void main(String[] args) {
         User aa = User.builder().age(11).name("aa").build();
    }
}
