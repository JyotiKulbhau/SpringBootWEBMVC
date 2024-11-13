package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.entity.JwtRequest;
import com.security.entity.JwtResponse;
import com.security.service.CustomUserDetailService;
import com.security.util.JwtUtil;

@RestController
public class JwtController {

	@Autowired
	private CustomUserDetailService userdetailsService;

	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtUtil;

	@PostMapping("/token")
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) {

		System.out.println(jwtRequest.getUsername());

		try {
			this.authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
		} catch (Exception e) {

		}

		// find area
		UserDetails userDetails = this.userdetailsService.loadUserByUsername(jwtRequest.getUsername());

		String token = this.jwtUtil.generateToken(userDetails);
		System.out.println("JWT " + token);

		return ResponseEntity.ok(new JwtResponse(token));

	}
}
