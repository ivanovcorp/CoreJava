package Java_03_06_OOP_Advanced_UnitTesting;

/**
 * Java Unit Testing Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class BankAccount
{
    private String name;
    private double balance;

    public BankAccount()
    {
        this.name = "Unnamed";
        this.balance = 0.0;
    }

    public void deposit(double sumToDeposit)
    {
        if (sumToDeposit <= 0)
        {
            throw new IllegalArgumentException("Deposit sum can not be negative or zero.");
        }
        this.balance += sumToDeposit;
    }

    public double getBalance()
    {
        return balance;
    }
}