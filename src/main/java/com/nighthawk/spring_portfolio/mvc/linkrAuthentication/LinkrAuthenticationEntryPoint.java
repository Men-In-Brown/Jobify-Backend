package com.nighthawk.spring_portfolio.mvc.linkrAuthentication;

import java.io.IOException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

// Custom authentication entry point class for handling unauthorized access to protected resources.

@Component
public class LinkrAuthenticationEntryPoint implements AuthenticationEntryPoint{
    @Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException {

		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
	}
}
