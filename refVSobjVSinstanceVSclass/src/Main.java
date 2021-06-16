public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());

        anotherHouse.setColor("green");

        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());

        House yelloHouse = new House("Yello");
        anotherHouse = yelloHouse;
        System.out.println(yelloHouse.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println(blueHouse.getColor());



    }
}
