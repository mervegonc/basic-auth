package com.project.signin.business.abstracts;

import java.util.Optional;
import java.util.UUID;

import com.project.signin.dto.auth.request.UserSigninRequest;
import com.project.signin.dto.auth.request.UserSignupRequest;
import com.project.signin.dto.request.UserDetailUpdateRequest;
import com.project.signin.entity.UserDetail;

public interface UserService {









    String login(UserSigninRequest userSigninRequest);

	void signup(UserSignupRequest userSignupRequest);

	void signupAndAssignRole(UserSignupRequest userSignupRequest, String roleName);
    boolean isUserExist(String username);

    UUID getUserIdByUsername(String usernameOrEmail);

     boolean updateUserDetails(UserDetailUpdateRequest request);

     Optional<UserDetail> getUserDetailsById(UUID userId);

    void createUserDetails(UserDetailUpdateRequest request);


}
