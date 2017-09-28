package sub0929;

public class Account {
	private String accountNo;
	private boolean creditLine;
	private int creditLineLimit;
	private int balance;
	
	public Account() {
	}
	
	
	public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		this.creditLineLimit = creditLineLimit;
		this.balance = balance;
	}


	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public boolean isCreditLine() {
		return creditLine;
	}
	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}
	public int getCreditLineLimit() {
		return creditLineLimit;
	}
	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}
	public int getBalane() {
		return balance;
	}
	public void setBalane(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws Exception {
		balance -= money;
		if((creditLineLimit) < -balance) {
			balance += money;
			throw new Exception("�ܰ����� ��ݺҰ� �մϴ�.");
		}
	}
	
	public String toString() {
		return "���¹�ȣ : "+accountNo+", �ܰ� : "+balance+"��\t[[  "+(-creditLineLimit)+"�� ���̳ʽ�����   ]]";
	}
}