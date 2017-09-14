package Java_03_06_OOP_Advanced_UnitTesting;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

/**
 * Java Unit Testing Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class BankAccountTests
{
    private static final double DEPOSIT_SUM = 50;
    private static final double DEPOSIT_NEGATIVE_SUM = -20;

    private BankAccount account;

    @Before
    public void createAccount()
    {
        this.account = new BankAccount();
    }

    @Test
    public void depositShouldAddMoney()
    {
        this.account.deposit(DEPOSIT_SUM);        ;
        Assert.assertEquals("Wrong balance", DEPOSIT_SUM, this.account.getBalance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void depositNegativeSum()
    {
        this.account.deposit(DEPOSIT_NEGATIVE_SUM);
    }
}



