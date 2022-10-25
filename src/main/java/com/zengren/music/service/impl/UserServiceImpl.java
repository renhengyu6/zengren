package com.zengren.music.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zengren.music.entity.User;
import com.zengren.music.mapper.UserMapper;
import com.zengren.music.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-10-20 22:37:18
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource//这个和@Autowired差不多
    private UserMapper userMapper;
    //实现id查询
    public User getUserInfoByUserId(Integer id){
        return userMapper.selectById(id);
    }
    //实现查询用户信息
    public List<User> getUserInfoByUserName(String userName) {
        LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUserName,userName);
        List<User> users=userMapper.selectList(queryWrapper);
        return CollectionUtils.isNotEmpty(users)?users:null;
    }
    //添加用户
    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }
}

