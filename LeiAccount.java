
public class 
public class LeiAccount extends BankAccount {

	public LeiAccount(String accountnum, float sum) {
		super(accountnum, sum);
	}

	public float getTotalAmount() {
        return getSum();
    }
	public float getDobanda() {
        return 0;
    }
	public void transfer(BankAccount wouldTranslate, float sum) {
        if (wouldTranslate instanceof LeiAccount) {
            if (getSum() >= sum) {
                setSum(getSum() - sum);
                wouldTranslate.setSum(wouldTranslate.getSum() + sum);
                System.out.println("Transfer realizat cu succes!");
            } else {
                System.out.println("Fonduri insuficiente pentru transfer.");
            }
        } else {
            System.out.println("Transferurile pot fi realizate doar între conturi în lei.");
        }
    }
}
 extends BankAccount {

	public LeiAccount(String accountnum, float sum) {
		super(accountnum, sum);
	}

	public float getTotalAmount() {
        return getSum();
    }
	public float getDobanda() {
        return 0;
    }
	public void transfer(BankAccount wouldTranslate, float sum) {
        if (wouldTranslate instanceof LeiAccount) {
            if (getSum() >= sum) {
                setSum(getSum() - sum);
                wouldTranslate.setSum(wouldTranslate.getSum() + sum);
                System.out.println("Transfer realizat cu succes!");
            } else {
                System.out.println("Fonduri insuficiente pentru transfer.");
            }
        } else {
            System.out.println("Transferurile pot fi realizate doar între conturi în lei.");
        }
    }
}
