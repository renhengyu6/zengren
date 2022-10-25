package com.zengren.music.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zengren.music.entity.User;

import java.util.List;


/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2022-10-20 22:37:17
 */
public interface UserService extends IService<User> {
    User getUserInfoByUserId(Integer id);
    List<User> getUserInfoByUserName(String userName);

    int insertUser(User user);


}

