//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        creditCard myCreditCard = new creditCard("Stewie Griffin", "BSI", "123456789", 1000);

        System.out.println("Customer: " + myCreditCard.getCustomer());
        System.out.println("Bank: " + myCreditCard.getBank());
        System.out.println("Account: " + myCreditCard.getAccount());
        System.out.println("Limit: " + myCreditCard.getLimit());
        System.out.println("Balance: " + myCreditCard.getBalance());

        myCreditCard.charge(1000);
        myCreditCard.charge(2000);
        myCreditCard.makePayment(2000);

        System.out.println("Updated Balance: " + myCreditCard.getBalance());
    }
}