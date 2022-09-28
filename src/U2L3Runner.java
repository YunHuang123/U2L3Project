public class U2L3Runner {
    public static void main(String[] args) {
        Box box = new Box(10.5, 12.6, 15.75);

        // Use the return value from volume() by storing it in a variable
        double boxVolume = box.volume();
        System.out.println("My box has a volume of " + boxVolume);

        // Use the return value from volume() by printing it
        System.out.println("My box has a volume of " + box.volume());

        // void methods are DESIGNED to be used as just a statement
        box.printDimensions();  // this is how void methods should be used!

    }
}
