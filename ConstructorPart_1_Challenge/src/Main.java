public class Main {
    public static void main(String[] args) {

//        Account bobsAccount = new Account(); // ("12345", 0.00,"Bob Brown" ,"myemail@bob.com", "010002110");
//
//
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber()+" name "+timsAccount.getCustomerName());
        System.out.println("Current Balance is "+timsAccount.getBalance());
        timsAccount.withdrawal(100.55);

//        VipCustomer customer1 = new VipCustomer();
//
//        System.out.println(customer1.getName());
//
//        VipCustomer customer2 = new VipCustomer("Bob", "bob@email.com");
//
//        System.out.println(customer2.getCreditLimit()+" "+customer2.getName());
//
//        VipCustomer customer3 = new VipCustomer("Emon", 25000.00, "emon@gmail.com");
//
//        System.out.println(customer3.getName()+" "+customer3.getCreditLimit()+" "+customer3.getEmailAddress());

    }
}
