package com.atlili.reggie.service.impl;

import com.atlili.reggie.bean.ShoppingCart;
import com.atlili.reggie.mapper.ShoppingCartMapper;
import com.atlili.reggie.service.ShoppingCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
