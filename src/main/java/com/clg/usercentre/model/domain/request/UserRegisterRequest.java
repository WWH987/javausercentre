package com.clg.usercentre.model.domain.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * User request
 *
 * @author CLG
 */

@Data
public class UserRegisterRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

}
