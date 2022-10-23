package com.zengren.music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zengren.music.entity.User;
import com.zengren.music.mapper.UserMapper;
import com.zengren.music.service.UserService;
import org.springframework.stereotype.Service;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-10-20 22:37:18
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

