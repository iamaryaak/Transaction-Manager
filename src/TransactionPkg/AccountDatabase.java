package TransactionPkg;

public class AccountDatabase {

    private Account[] accounts;
    private int size;

    private int find(Account account) {
        return 0;
    }

    private void grow() {
    }

    public boolean add(Account account) {
        //return false if account exists
        return false;
    }

    public boolean remove(Account account) {
        //return false if account doesn't exist
        return false;
    }

    public boolean deposit(Account account, double amount) {
        //return 0: withdrawal successful, 1: insufficient funds, -1 account doesn’t exist
        return false;
    }

    public int withdrawal(Account account, double amount) {
        return 0;
    }

    private void sortByDateOpen() {
        //sort in ascending order
    }

    private void sortByLastName() {
        //sort in ascending order
    }

    public void printByDateOpen() {
    }

    public void printByLastName() {
    }

    public void printAccounts() {
    }

}



