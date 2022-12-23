package com.xgift.service;

import java.util.Map;

import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import com.xgift.dto.LocalUser;
import com.xgift.dto.UserRegistrationForm;
import com.xgift.exception.UserAlreadyExistAuthenticationException;
import com.xgift.model.User;

/**
 * 
 * @since 26/3/18
 */
public interface UserService {

	public User registerNewUser(UserRegistrationForm UserRegistrationForm) throws UserAlreadyExistAuthenticationException;

	User findUserByEmail(String email);

	LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}
