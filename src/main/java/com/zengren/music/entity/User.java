package com.zengren.music.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2022-10-20 22:37:16
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    private Integer userId;
    
    private String userName;
    
    private String userPassword;
    
    private Date createTime;

}

