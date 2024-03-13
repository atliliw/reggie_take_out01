package com.atlili.reggie.service;

import com.atlili.reggie.bean.Category;
import com.baomidou.mybatisplus.extension.service.IService;


public interface CategoryService extends IService<Category> {

    public void remove(Long ids);
}
