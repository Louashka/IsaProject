package models;

public class Answer {
	private int id_answer;
	private int id_question;
	private String answer_content;
	private boolean status;
	

	
public Answer(int id_answer,int id_question,
		String answer_content,boolean status){
	this.id_answer=id_answer;
	this.id_question=id_question;
	this.answer_content=answer_content;
	this.status=status;
	
}



public int getId_answer() {
	return id_answer;
}



public void setId_answer(int id_answer) {
	this.id_answer = id_answer;
}



public int getId_question() {
	return id_question;
}



public void setId_question(int id_question) {
	this.id_question = id_question;
}



public String getAnswer_content() {
	return answer_content;
}



public void setAnswer_content(String answer_content) {
	this.answer_content = answer_content;
}



public boolean isStatus() {
	return status;
}



public void setStatus(boolean status) {
	this.status = status;
}
}
