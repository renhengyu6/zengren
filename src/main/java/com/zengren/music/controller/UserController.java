package com.zengren.music.controller;



import com.zengren.music.entity.User;
import com.zengren.music.mapper.UserMapper;
import com.zengren.music.service.UserService;
import com.zengren.music.tongyong.enums.FailEnums;
import com.zengren.music.tongyong.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-10-20 22:50:46
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController{
    @Autowired
    private UserService userService;

    @PostMapping("/userRegister")
//    @ApiOperation(value = "用户注册",httpMethod = "POST")
    public Response<Boolean> userRegister(@RequestParam(required = false) String userName,
                                          @RequestParam(required = false) String userPassword){
        List<User> userList= userService.getUserInfoByUserName(userName);
        if (CollectionUtils.isNotEmpty(userList)){
            return Response.fail(FailEnums.EXISTS_ERROR.getCode(), "用户名已存在");
        }
        User user=new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        int zonghe=userService.insertUser(user);
        if(zonghe==0){
            return Response.fail(FailEnums.DATA_ERROR.getCode(), "注册失败");
        }
        return Response.succ(null,"注册成功");
    }
}

