import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random rnd = ThreadLocalRandom.current();
        List<IMakeCoffee> coffeeMakeList = new ArrayList<>();

        coffeeMakeList.add(new MakeAmericano());
        coffeeMakeList.add(new MakeCapucino());
        coffeeMakeList.add(new MakeMokka());

        for (int i = 0; i < 10; i++) {
            int index = rnd.nextInt(coffeeMakeList.size());
            ICoffeeItem coffeeItem = coffeeMakeList.get(index).makeCoffee();
            coffeeItem.orderCoffee();
        }
    }
}