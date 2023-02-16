/**
 * 
 */
package com.signify.bean;
import java.util.Date;

/**
 * @author AMIT KUMAR
 *
 */
public class Admin extends User {
	private Date doj;

	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}

	/**
	 * @param doj the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}
}
