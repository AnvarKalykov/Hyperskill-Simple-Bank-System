package SimpleBank;

public class Main {
    public static void main(String[] args) {
        AccountUser accountUser = new AccountUser(args[1]);
        accountUser.startSystem();

    }
}