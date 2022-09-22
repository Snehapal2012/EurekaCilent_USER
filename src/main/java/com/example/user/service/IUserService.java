package com.example.user.service;

import com.example.user.dto.LoginDTO;
import com.example.user.dto.UserDTO;
import com.example.user.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User register(UserDTO userDTO) throws Exception;

    List<User> getAll();

    Optional<User> getByUserId(long id);

    User getByEmail(String email);

    User updateUserByEmail(UserDTO userDTO, String email);

    String loginCheck(String email, String password);

    User forgotPassword(UserDTO userDTO, String email);

    void deleteById(long id, String token);

    String login(LoginDTO loginDTO);

    User getDetailsById(long id);
}
