package p1.model;

import java.util.List;

public class User {
	
	String username;
	String password;
	String securityQuestion;
	String securityQuestionAnswer;
	List<Product> purchasedProducts;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String securityQuestion, String securityQuestionAnswer, List<Product> purchasedProducts) {
		super();
		this.username = username;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.securityQuestionAnswer = securityQuestionAnswer;
		this.purchasedProducts = purchasedProducts;
	}
	public List<Product> getPurchasedProducts() {
		return purchasedProducts;
	}
	public void setPurchasedProducts(List<Product> purchasedProducts) {
		this.purchasedProducts = purchasedProducts;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityQuestionAnswer() {
		return securityQuestionAnswer;
	}
	public void setSecurityQuestionAnswer(String securityQuestionAnswer) {
		this.securityQuestionAnswer = securityQuestionAnswer;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", securityQuestion=" + securityQuestion
				+ ", securityQuestionAnswer=" + securityQuestionAnswer + ", purchasedProducts=" + purchasedProducts
				+ "]";
	}
	
	

}
