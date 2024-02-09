public class MakeCapucino implements IMakeCoffee{
    @Override
    public ICoffeeItem makeCoffee() {
        return new Capucino();
    }
}
