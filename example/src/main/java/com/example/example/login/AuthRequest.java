package com.example.example.login;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthRequest {
	
	 private String username ;
	    private String password;

}
