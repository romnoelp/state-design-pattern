public class SuspendedState implements AccountState {
    @Override
    public void deposit(Account account, double depositAmount) {
        System.out.println("Cannot deposit on a suspended account.");
    }

    @Override
    public void withdraw(Account account, double withdrawAmount) {
        System.out.println("Cannot withdraw with a suspended account.");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Cannot suspend an already suspended account.");
    }

    @Override
    public void activate(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("Account activated successfully.");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Suspended account closed.");
    }
}
