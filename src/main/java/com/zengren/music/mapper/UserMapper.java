package com.zengren.music.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zengren.music.entity.User;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-20 22:50:46
 */
public interface UserMapper extends BaseMapper<User> {
    boolean insertUser(User user);
}

