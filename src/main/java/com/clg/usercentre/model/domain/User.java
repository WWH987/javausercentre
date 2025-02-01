package com.clg.usercentre.model.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * User Name
     */
    private String username;

    /**
     * ACC Nums
     */
    private String userAccount;

    /**
     * Avatar
     */
    private String avatarUrl;

    /**
     * gender
     */
    private Integer gender;

    /**
     * userPassword
     */
    private String userPassword;

    /**
     * phone
     */
    private String phone;

    /**
     * email
     */
    private String email;

    /**
     * userStatus
     */
    private Integer userStatus;

    /**
     * create time
     */
    private Date createTime;

    /**
     * updateTime
     */
    private Date updateTime;

    /**
     * role 0 - 1/ N - A
     */
    private Integer userRole;

    /**
     * isDelete
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}