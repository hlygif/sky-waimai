package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * 新增菜品和口味数据
 */
public interface DishService {
    public void saveWithFlavor(DishDTO dishDTO);
}
