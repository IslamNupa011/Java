
public class Account 
{
    public String accountname =  "Savings Account ";
    public void showAccountName()
    {
        System.out.println(accountname);
    }
    public static void main(String[] args)

    {
        Account account = new Account();
        account.showAccountName();
    }
}
