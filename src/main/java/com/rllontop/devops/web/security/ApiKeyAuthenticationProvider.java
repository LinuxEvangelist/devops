package com.rllontop.devops.web.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class ApiKeyAuthenticationProvider implements AuthenticationProvider {

  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    String apiKey = (String) authentication.getPrincipal();

    if (ObjectUtils.isEmpty(apiKey)) {
      throw new InsufficientAuthenticationException("No API key in request");
    } else {
      if ("2f5ae96c-b558-4c7b-a590-a501ae1c3f6c".equals(apiKey)) {
        return new ApiKeyAuthenticationToken(apiKey, true);
      }
      throw new BadCredentialsException("API Key is invalid");
    }
  }

  @Override
  public boolean supports(Class<?> authentication) {
    return ApiKeyAuthenticationToken.class.isAssignableFrom(authentication);
  }
}
