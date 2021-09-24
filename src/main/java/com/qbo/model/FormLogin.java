package com.qbo.model;

public class FormLogin {

	private String usuario;
	private String password;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public FormLogin(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}
	public FormLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
