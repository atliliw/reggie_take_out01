package com.atlili.reggie.dto;

import com.atlili.reggie.bean.Setmeal;
import com.atlili.reggie.bean.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
