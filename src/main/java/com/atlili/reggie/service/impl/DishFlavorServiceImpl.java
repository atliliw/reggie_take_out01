package com.atlili.reggie.service.impl;

import com.atlili.reggie.bean.DishFlavor;
import com.atlili.reggie.mapper.DishFlavorMapper;
import com.atlili.reggie.service.DishFlavorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
