
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account first = new Account("Matthews account", 1000.00);
        Account second = new Account("My account", 0);
        
        first.withdrawal(100);
        second.deposit(100);
        
        System.out.println(first);
        System.out.println(second);
        
    }
}
