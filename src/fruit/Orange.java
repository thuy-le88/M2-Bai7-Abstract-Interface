package fruit;

public class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "could be make orange-juice.";
    }

    public static void main(String[] args) {
        Orange orange=new Orange();
        System.out.println(orange.howToEat());
    }
}
