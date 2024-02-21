public class creditCard {

    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;

    public creditCard(String cus, String bnk, String acc, int lim) {
        customer = cus;
        bank = bnk;
        account = acc;
        limit = lim;
        balance = 0.0;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(double price) {
        if (price > 0 && (balance + price) <= limit) {
            balance += price;
            return true;
        } else {
            return false;
        }
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Payment of " + amount + " made. Now the balance is " + balance);
        } else {
            System.out.println("Invalid Amount.");

        }
    }
}