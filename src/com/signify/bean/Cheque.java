/**
 * 
 */
package com.signify.bean;

/**
 * @author AMIT KUMAR
 *
 */
public class Cheque extends Payment{
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
	 * @return the chequeNumber
	 */
	public int getChequeNumber() {
		return chequeNumber;
	}
	/**
	 * @param chequeNumber the chequeNumber to set
	 */
	public void setChequeNumber(int chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	private int chequeNumber;
}
