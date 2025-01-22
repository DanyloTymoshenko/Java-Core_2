public class Main {
    public static void main(String[] args) {

        User user1 = new User(1,"Johnny", "Depp");
        User user2 = new User(2,"Integra", "Hellsing");
        User user3 = new User(3,"Victoria", "Seras");

        Account account1 = new Account(111, 7324, user1);
        Account account2 = new Account(666, 100000, user2);
        Account account3 = new Account(333, 56789, user3);

        Account[] accounts = {account1, account2, account3};

        AccountService service = new AccountServiceImpl(accounts);

        Account account = service.findAccountByOwnerId(2);
        System.out.println(account != null ? "Account found: Id = " + account.getId() : "No account");

        long count = service.countAccountsWithBalanceGreaterThan(2000);
        System.out.println("Accounts with balance 1500+ " + count);

    }
}