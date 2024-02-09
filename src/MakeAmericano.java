public class MakeAmericano implements IMakeCoffee{
    @Override
    public ICoffeeItem makeCoffee() {
        return new Americano();
    }
}
