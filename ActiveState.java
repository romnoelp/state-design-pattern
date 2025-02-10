public class ActiveState implements AccountState {
    @Override
    public void deposit(Account account, double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Deposit to the account was successful. " + account.toString());
    }

    @Override
    public void withdraw(Account account, double withdrawAmount) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("Withdrawal with the amount of. " + account.toString() + " was successful.");
    }

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended due to inactivity and insufficient balance for requirements.");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated.");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed.");
    }
}
