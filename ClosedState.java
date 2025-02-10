public class ClosedState implements AccountState{
    @Override
    public void deposit(Account account, double depositAmount) {
        System.out.println("Cannot deposit on a closed account.");
    }

    @Override
    public void withdraw(Account account, double withdrawAmount) {
        System.out.println("Cannot withdraw with a closed account.");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Cannot suspend an already closed account.");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Cannot activate an already closed account.");
    }

    @Override
    public void close(Account account) {
        System.out.println("Cannot close an already closed state.");
    }
}
