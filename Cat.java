public class Cat {

    String name;
    int age;
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public void meow() {
        System.out.println("Meow!");
    }

    public static int getCatCount() {
        return catCount;
    }
    public static void main (String[] args) {
        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;

        Cat anotherCat = new Cat();
        anotherCat.name = "George";
        anotherCat.age = 3;

        System.out.println("Total number of cats: " + Cat.getCatCount());
    }
}