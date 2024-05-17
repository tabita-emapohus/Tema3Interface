
public class Euro extends BankAccount {
     private double interest = 3/10;
     
	public Euro(String accountnum, float sum) {
		super(accountnum, sum);
	}

	public float getInterest() {
        if (getSum() > 500) {
            return 3/10;
        } else {
            return 0;
        }
    }

    @Override
    public float getTotalAmount() {
        return getSum() * 3600;
    }
	
}
