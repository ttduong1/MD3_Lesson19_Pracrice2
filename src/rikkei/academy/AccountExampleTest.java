package rikkei.academy;

public class AccountExampleTest {
    private static AccountAxample accountAxample;

    public static final String[] validAccount = new String[] {"123abc_", "_abc123", "____", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[] {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountAxample = new AccountAxample();
        for (String account : validAccount){
            boolean isvalid = accountAxample.validate(account);
            System.out.println("Account is " + account +"is valid: "+ isvalid);
        }
        for (String account : invalidAccount){
            boolean isvalid = accountAxample.validate(account);
            System.out.println("Account is " + account +"is valid: "+ isvalid);
        }
    }
}
