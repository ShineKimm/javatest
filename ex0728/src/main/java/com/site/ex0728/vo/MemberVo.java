package com.site.ex0728.vo;

public class MemberVo {
	
	public MemberVo() {}
	
	public MemberVo(String id, String pw, String name, String nickname, String gender, String tel, String address1,
			String addres2, String hobby) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickname = nickname;
		this.gender = gender;
		this.tel = tel;
		this.address1 = address1;
		this.addres2 = addres2;
		this.hobby = hobby;
	}

	private String id,pw,name,nickname,gender,tel,address1,addres2,hobby;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddres2() {
		return addres2;
	}
	public void setAddres2(String addres2) {
		this.addres2 = addres2;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	

}
