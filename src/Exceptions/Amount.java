package Exceptions;

public class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that){
        if(!this.currency.equals(that.currency)){
            throw new RuntimeException("Currency dont match");
        }

        this.amount += that.amount;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
