package fruit;

public class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "could be make apple-smoothie";
    }

    public static void main(String[] args) {
        Apple apple=new Apple();
        System.out.println(apple.howToEat());
    }
}
