package JavaWork;

public class Dog {

    private String name;
    int size;

    public static void main (String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();

        /*JavaWork.Dog[] myDogs = new JavaWork.Dog[3];

        myDogs[0] = new JavaWork.Dog();
        myDogs[1] = new JavaWork.Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "tobi";

        System.out.println("last dog's name is ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }*/
    }

    public void bark() {
        if (size > 60) {
            System.out.println("woof! woof!");
        } else if (size > 14) {
            System.out.println(name + " says RUFF RUFF!");
        } else {
            System.out.println("Yip! Yip!");
        }

    }

    public void eat() { }

    public void chaseCat() { }
}
