package di;

import java.util.Random;

public class GenerateID {

    public int getId(MyRandom random) {
        return random.nextInt(10);
    }

}
