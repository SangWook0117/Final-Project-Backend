package com.bitcamp.drrate.domain.oauth.google.service;

import java.io.IOException;

import com.bitcamp.drrate.domain.oauth.google.dto.response.GoogleUserInfoResponseDTO.UserInfoDTO;

import jakarta.servlet.http.HttpServletResponse;

public interface GoogleService {

    public void loginGoogle(HttpServletResponse response) throws IOException;

    public UserInfoDTO login(String code);

}
