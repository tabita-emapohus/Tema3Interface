
public abstract class  BankAccount {

	private String accountnum;
	private float sum;
	public BankAccount(String accountnum, float sum) { 
		this.accountnum = accountnum;
		this.sum = sum;
	}
	public float getSum() {
		return sum;
	}
	public void setSum(float sum) {
        this.sum = sum;
    }
	
	public String getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(String accountnum) {
		this.accountnum = accountnum;
	}
	public void transfer(BankAccount  wouldTranslate, float sum) {
        if (this.sum >= sum) {
            this.sum -= sum;
            wouldTranslate.setSum(wouldTranslate.getSum() + sum);
            System.out.println("Transfer realizat cu succes!");
        } else {
            System.out.println("Fonduri insuficiente pentru transfer.");
        }
    }
    public float getTotalAmount() {
        return sum;
    }
}
