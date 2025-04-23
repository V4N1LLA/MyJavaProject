package workshop.account.entity;

public class Account {
	private String custId;
	private String acctId;
	private int balance;
	
	//Default Constructor(생성자)
	public Account() {
		System.out.println("Default Constructor Called..");
	}
	
	//Constructor Overloading(생성자 중복정의)
	public Account(String custId, String acctId, int balance) {
		super();
		this.custId = custId;
		this.acctId = acctId;
		this.balance = balance;
	}
	
	//setter
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
	
	//getter
	public String getCustId() {
		return custId;
	}
	public String getAcctId() {
		return acctId;
	}
	public int getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	//출금
	public void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("잔액부족");
		}
		this.balance -= amount;
	}
}
