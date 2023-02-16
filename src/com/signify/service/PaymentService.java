/**
 * 
 */
package com.signify.service;
import com.signify.bean.Card;
import com.signify.bean.Cheque;
import com.signify.bean.NetBanking;
import com.signify.bean.Scholarship;
/**
 * @author AMIT KUMAR
 *
 */
public class PaymentService {
	public void sendNotification() {
		
	}
	
	public void ModeOfPayment(int value) {
		if(value == 1) {
			Scholarship sName =new Scholarship();
			sName.setScholarshipName("Temp");
		}
		else if(value == 2) {
			Cheque cq = new Cheque();
			//put setters for cheque
		}
		else if(value == 3) {
			System.out.println("Selected Cash");
		}
		else if(value == 4) {
			Card cd = new Card();
			//put setters for card
		}
		else {
			NetBanking nb = new NetBanking();
			//put setters for netbanking
		}
	}
	
	
}
