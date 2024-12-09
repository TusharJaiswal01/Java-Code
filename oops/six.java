class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000);
        System.out.println("Balance: " + acc.getBalance());
    }
}