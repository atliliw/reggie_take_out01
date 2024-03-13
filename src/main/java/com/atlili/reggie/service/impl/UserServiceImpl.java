package com.atlili.reggie.service.impl;

import com.atlili.reggie.bean.User;
import com.atlili.reggie.mapper.UserMapper;
import com.atlili.reggie.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
