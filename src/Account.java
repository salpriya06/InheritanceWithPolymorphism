public class Account {

    private int accountNumber;
    private String accountHolder;
    private double balance;
//    private double balance1;



    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount){
        balance = balance + amount;
        return balance;
    }

    public boolean withdraw(double amount){
        if(balance > 0) {
            balance = balance - amount;
        }
        System.out.println("You can't withdraw");
        System.out.println(amount);
        return true;
    }

    public void getAccountInfo(){
        System.out.println("Account No : " + accountNumber + " Account Holder Name : " + accountHolder + " Account Balance : " + balance);
    }
}
