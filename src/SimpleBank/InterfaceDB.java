package SimpleBank;

public interface InterfaceDB {

    void createAccount(Account userAccount);

    Account loginAccount(Card userCard);

    void updateAccount(String cardNumber, int changeBalance);

    void deleteAccount(Account userAccount);

    boolean findAccount(String cardNumber);

    void close();
}

