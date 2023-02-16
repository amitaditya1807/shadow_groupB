/**
 * 
 */
package com.signify.service;
import com.signify.bean.GradeCard;

/**
 * @author AMIT KUMAR
 *
 */
public class GradeCardService {
	public void calculateCpi() {
		GradeCard card = new GradeCard();
		card.setSemester(5);
		System.out.println(card.getSemester());
		
	}
	
	
	
}
