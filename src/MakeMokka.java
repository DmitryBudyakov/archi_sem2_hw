public class MakeMokka implements IMakeCoffee{
    @Override
    public ICoffeeItem makeCoffee() {
        return new Mokka();
    }
}
