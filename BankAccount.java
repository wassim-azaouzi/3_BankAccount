import java.util.Random ;

class BankAccount {
private double checkingBalance = 0;
private double savingsBalance = 0.0;
public long accountNumber=0000000000 ;

private static  int numberAccountsCreated = 0;
private static double totalAmount= 0.0 ;

public BankAccount(double checkingBalance, double savingsBalance ) {
    this.savingsBalance = savingsBalance ;
    this.checkingBalance = checkingBalance ;
    numberAccountsCreated++ ;
    accountNumber= generateAccountNumber();
    totalAmount+= savingsBalance + checkingBalance ;
}

public double getCheckingBalance(){
    return checkingBalance ;
}
public double getSavingsBalance(){
    return savingsBalance ;
}
public void checkingsDeposit(double money){
    checkingBalance += money ;

}
public void savingsDeposit(double money){
    savingsBalance += money ;
}
public void checkingWithdraw(double withdraw){
    checkingBalance-= withdraw;
}
public void savingsWithdraw(double withdraw){
    savingsBalance-= withdraw;
}
public double Total() {
    return checkingBalance + savingsBalance  ;
}

private long generateAccountNumber() {
        Random random = new Random();
        long accountNumber = 100_000_000L + random.nextInt(900_000_000);
        return accountNumber;
    }
}
