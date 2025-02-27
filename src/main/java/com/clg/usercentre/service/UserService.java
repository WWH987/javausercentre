package com.clg.usercentre.service;

import com.clg.usercentre.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @author Peter
 * @description 针对表【user】的数据库操作Service
 * @createDate 2025-01-31 14:50:29
 */
public interface UserService extends IService<User> {

    /**
     * User comment
     *
     * @param userAccount   Account
     * @param userPassword  Password
     * @param checkPassword Authenticate
     * @return new user id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     *
     * @param userAccount Account
     * @param userPassword Passowrd
     * @return User Information
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * User all setter
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);
}
