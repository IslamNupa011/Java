
public class Customer
{
    public String name = "James Bond"; 
    public static void main(String[] args)
    {
        Account account = new Account();
        account.showAccountName();
        Customer customer = new Customer();
        System.out.println(customer.name);
    }
    
}
