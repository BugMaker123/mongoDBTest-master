package cn.com.ice.mongodbtest.controller;

import cn.com.ice.mongodbtest.entity.User;
import cn.com.ice.mongodbtest.result.ResultCode;
import cn.com.ice.mongodbtest.result.ResultModel;
import cn.com.ice.mongodbtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("add")
    public ResultModel addData(@RequestBody User user){
        userService.add(user);
        return ResultModel.createResult(ResultCode.SUCCESS);
    }

    @PostMapping("findData")
    public ResultModel<User> findData(@RequestBody User user){
        User data = userService.findData(user);
        return ResultModel.createSuccessResult(data);
    }
}
