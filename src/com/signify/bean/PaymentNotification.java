/**
 * 
 */
package com.signify.bean;

/**
 * @author AMIT KUMAR
 *
 */
public class PaymentNotification {
	private int studentId;
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the referenceId
	 */
	public int getReferenceId() {
		return referenceId;
	}
	/**
	 * @param referenceId the referenceId to set
	 */
	public void setReferenceId(int referenceId) {
		this.referenceId = referenceId;
	}
	/**
	 * @return the notificationId
	 */
	public int getNotificationId() {
		return notificationId;
	}
	/**
	 * @param notificationId the notificationId to set
	 */
	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}
	private int referenceId;
	private int notificationId;
}
