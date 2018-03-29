public class GoodDogTestDrive {

    public static void main ( String[] args ) {
        GettersAndSetters one = new GettersAndSetters();
        one.setSize(70);
        GettersAndSetters two = new GettersAndSetters();
        two.setSize(8);
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark();
        two.bark();

        int a = 3;
        byte b = 3;
        if (a == b) {
            System.out.println("true");
        } else {
            System.out.println("lie!!!");
        }
    }
}
