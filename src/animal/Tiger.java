package animal;

public class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrr....";
    }

    public static void main(String[] args) {
        Tiger tiger=new Tiger();
        System.out.println(tiger.makeSound());
    }
}
