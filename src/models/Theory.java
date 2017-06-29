package models;

public class Theory {
	private int id_theory; 
	private int id_block;
	private String theory_content;
	
public Theory(int id_theory,int id_block,String theory_content){
	this.id_block=id_block;
	this.id_theory=id_theory;
	this.theory_content=theory_content;
}

public int getId_theory() {
	return id_theory;
}

public void setId_theory(int id_theory) {
	this.id_theory = id_theory;
}

public int getId_block() {
	return id_block;
}

public void setId_block(int id_block) {
	this.id_block = id_block;
}

public String getTheory_content() {
	return theory_content;
}

public void setTheory_content(String theory_content) {
	this.theory_content = theory_content;
}
}
