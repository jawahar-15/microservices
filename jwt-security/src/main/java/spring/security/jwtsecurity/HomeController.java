package spring.security.jwtsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.BadRequest;

@RestController
public class HomeController {

	@Autowired
	AuthenticationManager authManager;
	
	@Autowired
	MyUserDetailsService  userDetails;
	
	@Autowired
	JwtUtil jwtutil;
	
	@GetMapping("/home")
	public String home() {
		return "<h1> Welcome Home ! </h1>";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1> Welcome User ! </h1>";
	}

	@GetMapping("/admin")
	public String admin() {
		return "<h1> Welcome Admin ! </h1>";
	}

	@PostMapping("/auth")
	public ResponseEntity<AuthResponse> auth(@RequestBody AuthRequest authRequest) throws Exception{
		try {			
			authManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUserName(),authRequest.getPassword()));
		} catch(BadCredentialsException ex) {
			throw new Exception("Invalid Credentials" + ex);
		}
		final UserDetails userDtl = userDetails.loadUserByUsername(authRequest.getUserName());
		final String jwtToken = jwtutil.generateToken(userDtl);
		return ResponseEntity.ok(new AuthResponse(jwtToken));
	}


}
