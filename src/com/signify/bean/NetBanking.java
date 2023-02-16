/**
 * 
 */
package com.signify.bean;

/**
 * @author AMIT KUMAR
 *
 */
public class NetBanking extends Payment{
	private String bankName;
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the iFSCcode
	 */
	public String getIFSCcode() {
		return IFSCcode;
	}
	/**
	 * @param iFSCcode the iFSCcode to set
	 */
	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}
	private int accountNumber;
	private String IFSCcode;
}
