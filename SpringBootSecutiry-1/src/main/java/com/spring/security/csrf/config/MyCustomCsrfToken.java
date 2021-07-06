package com.spring.security.csrf.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;

public class MyCustomCsrfToken implements CsrfTokenRepository {

	@Override
	public CsrfToken generateToken(HttpServletRequest request) {
		CsrfToken csrf = new org.springframework.security.web.csrf.DefaultCsrfToken
				("X-CSRF-TOKEN", "_csrf", "ABC123456");
		return csrf;
	}

	@Override
	public void saveToken(CsrfToken token, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public CsrfToken loadToken(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
