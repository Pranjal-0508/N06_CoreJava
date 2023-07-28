//Program to demonstrate on Encapsulation 
//Encapsulation : Achieves Data Hiding Using Private Access Specifiers

package org.tnsif.encapsulation;

public class HDFC {
	
	//Private Data Members
	
	private String accType;
	private long accountNo;
	private long atmCardNo;
	private int pinNo;
	
	//getters and setters method ..... right click on screen -->> source -->> generate getters and setters 
	
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getAtmCardNo() {
		return atmCardNo;
	}
	public void setAtmCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	//to-strings method
	
	@Override
	public String toString() {
		return "HDFC [accType=" + accType + ", accountNo=" + accountNo + ", atmCardNo=" + atmCardNo + ", pinNo=" + pinNo
				+ "]";
	}

	
	
}
