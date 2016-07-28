package mypack.actions;

import java.util.List;

import mypack.beans.Student;

public class ListAction {

	private List<Student> updatedStudentList;

	public String execute(){
		System.out.println(updatedStudentList);
		return "SUCCESS";
	}
	public List<Student> getUpdatedStudentList() {
		return updatedStudentList;
	}

	public void setUpdatedStudentList(List<Student> updatedStudentList) {
		this.updatedStudentList = updatedStudentList;
	}
	
	
}
