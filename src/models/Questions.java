package models;

public class Questions {
	private int id_question;
	private int id_block;
	private String content;
	private int answer_type;
	
public Questions(int id_questionint,int  id_block,
String content,int answer_type)	{
	this.answer_type=answer_type;
	this.content=content;
	this.id_block=id_block;
	this.id_question=id_question;
}

public int getId_question() {
	return id_question;
}

public void setId_question(int id_question) {
	this.id_question = id_question;
}

public int getId_block() {
	return id_block;
}

public void setId_block(int id_block) {
	this.id_block = id_block;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public int getAnswer_type() {
	return answer_type;
}

public void setAnswer_type(int answer_type) {
	this.answer_type = answer_type;
}
}
