
class TestBankAccount { 
public static void main (String[]arg) {
    BankAccount account1 = new BankAccount(120.02 ,20.25);
    BankAccount account2 = new BankAccount(1500 , 1200) ;
    System.out.println (account1.getCheckingBalance());
    System.out.println (account1.getSavingsBalance());
    account1.checkingsDeposit(12.22);
    account1.savingsDeposit(10.00);
    System.out.println (account1.getCheckingBalance());
    System.out.println (account1.getSavingsBalance());
    System.out.println (account1.accountNumber);

    account1.checkingWithdraw(10);
    account1.savingsWithdraw(10);
    System.out.println (account1.getCheckingBalance());
    System.out.println (account1.getSavingsBalance());

    System.out.println (account2.getCheckingBalance());
    System.out.println (account2.getSavingsBalance());
    account2.checkingsDeposit(12.22);
    account2.savingsDeposit(10.00);
    System.out.println (account2.getCheckingBalance());
    System.out.println (account2.getSavingsBalance());
    
    account2.checkingWithdraw(10);
    account2.savingsWithdraw(10);
    System.out.println (account2.getCheckingBalance());
    System.out.println (account2.getSavingsBalance());
    System.out.println (account2.accountNumber);

} }