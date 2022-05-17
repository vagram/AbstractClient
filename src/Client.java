public class Client {
    protected double getAmount;

    public Client() {
        this.getAmount = getAmount;
    }

    public double getGetAmount() {
        return getAmount;
    }

    public void setGetAmount(double getAmount) {
        this.getAmount = getAmount;
    }
    public void put(double deposit){
        if (deposit > 0) {
            getAmount = getAmount + deposit;
            System.out.println("Сумма пополнения: " + deposit);
            return;
        } System.out.println("Нельзя пополнить на отрицательное значение!");
    }

    public void take(double credit){
        if (credit <= getAmount) {
            getAmount = getAmount - credit;
            System.out.println("Сумма снятия: " + credit);
            return;
        } System.out.println("Сумма снятия превышает баланс!");
    }

}
