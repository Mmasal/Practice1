package mmmmmmmmm;

public class SLI_Account {
	String name;
	long accno;
	long phone;
	int aadhar;
	String pan;
	String ifsc;
	String bank;
	String branch;

	public SLI_Account() {
	}

	public SLI_Account(String name, long accno, long phone, int aadhar, String pan, String ifsc, String bank,
			String branch) {
		super();
		this.name = name;
		this.accno = accno;
		this.phone = phone;
		this.aadhar = aadhar;
		this.pan = pan;
		this.ifsc = ifsc;
		this.bank = bank;
		this.branch = branch;
	}
	public void displayAccount() {
		System.out.println(name);
		System.out.println(accno);
		System.out.println(phone);
		System.out.println(aadhar);
		System.out.println(pan);
		System.out.println(ifsc);
		System.out.println(bank);
		System.out.println(branch);
	}
}
