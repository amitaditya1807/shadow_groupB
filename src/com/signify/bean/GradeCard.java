/**
 * 
 */
package com.signify.bean;
import java.util.*;
/**
 * @author AMIT KUMAR
 *
 */
public class GradeCard {
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
	 * @return the semester
	 */
	public int getSemester() {
		return semester;
	}
	/**
	 * @param semester the semester to set
	 */
	public void setSemester(int semester) {
		this.semester = semester;
	}
	/**
	 * @return the cpi
	 */
	public float getCpi() {
		return cpi;
	}
	
	public void setCpi(float cpi) {
		this.cpi = cpi;
	}
	/**
	 * @return the registeredCourses
	 */
	public List<String> getRegisteredCourses() {
		return registeredCourses;
	}
	
	public void setRegisteredCourses(List<String> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	private int semester;
	private float cpi;
	private List<String> registeredCourses;
}
