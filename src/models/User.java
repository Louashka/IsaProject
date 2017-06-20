package models;

public class User {
	private String id;
	private String nickname;
	private String password;
	private String email;
	private int level;
	private int progress;

	public User(String id,String nickname, String password,String email, int level,int progress){
		this.id=id;
		this.nickname=nickname;
		this.password=password;
		this.email=email;
		this.level=level;
		this.progress=progress;
		
	}
	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}
	
}
