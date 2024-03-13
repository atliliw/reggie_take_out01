package com.atlili.reggie.service;

import com.atlili.reggie.bean.Setmeal;
import com.atlili.reggie.dto.SetmealDto;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


public interface SetmealService extends IService<Setmeal> {
    void saveWithDish(SetmealDto setmealDto);

    void removeWithDish(List<Long> ids);
}
