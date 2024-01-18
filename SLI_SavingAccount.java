package opps;

public class SLI_SavingAccount extends SLI_Account {
	double balance;
	double roi;
	double limit;
	double minBal;

	public SLI_SavingAccount() {

	}

	public SLI_SavingAccount(String name,long accno,long phone,int aadhar,String pan,String ifsc,String bank,
	String branch,double balance, double roi, double limit, double minBal) {
		this.name = name;
		this.accno = accno;
		this.phone = phone;
		this.aadhar = aadhar;
		this.pan = pan;
		this.ifsc = ifsc;
		this.bank = bank;
		this.branch = branch;
		
		this.balance = balance;
		this.roi = roi;
		this.limit = limit;
		this.minBal = minBal;
	}

	public void displaySLI_Account() {
		displayAccount();
		System.out.println(balance);
		System.out.println(roi);
		System.out.println(limit);
		System.out.println(minBal);
	}
}
