package spring.security.jwtsecurity;

public class AuthResponse {

	private String jwtToken;

	public AuthResponse(String jwt) {
	 this.jwtToken = jwt;
	}
	
	public String getJwtToken() {
		return jwtToken;
	}
	
}
