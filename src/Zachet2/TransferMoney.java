package Zachet2;

public class TransferMoney {
    private int getId(Account fromAcct){

    }
    private void doTransfer(final Account fromAcct, final Account toAcct, final DollarAmount amount) throws InsufficientFundsException {
        if (fromAcct.getBalance().compareTo(amount) < 0)
            throw new InsufficientFundsException();
        else {
            fromAcct.debit(amount);
            toAcct.credit(amount);
        }
    }
    public void transferMoney(final Account fromAcct, final Account toAcct, final DollarAmount amount) throws InsufficientFundsException {
        int fromId= fromAcct.getId();
        int toId = fromAcct.getId();
        if (fromId < toId) {
            synchronized (fromAcct) {
                synchronized (toAcct) {
                    doTransfer(fromAcct, toAcct, amount)}
            }
        }
    } else  {
        synchronized (toAcct) {
            synchronized (fromAcct) {
                doTransfer(fromAcct, toAcct, amount)}
        }
    }
}


