public class Main {
    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
////        double price = hamburger.itemizehamburger();
////        hamburger.addHamburgerAddition1("Tomato", 0.27);
////        hamburger.addHamburgerAddition2("Lettuce", 0.75);
////        hamburger.addHamburgerAddition3("Cheese", 1.12);
////
////        System.out.println("Total burger price is "+hamburger.itemizehamburger());
////
////        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
//////        healthyBurger.itemizehamburger();
////        healthyBurger.addHealthAddition1("Egg", 5.43);
////        healthyBurger.itemizehamburger();
////        System.out.println("Total healthy burger price is "+healthyBurger.itemizehamburger());
////
////        DeluxeBurger db = new DeluxeBurger();
////        db.addHamburgerAddition1("Should not do this", 50.53);
////        db.itemizehamburger();

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());


    }
}
