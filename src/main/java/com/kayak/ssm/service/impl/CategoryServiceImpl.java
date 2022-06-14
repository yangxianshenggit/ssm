package com.kayak.ssm.service.impl;

import com.kayak.ssm.bean.Category;
import com.kayak.ssm.mapper.CategoryMapper;
import com.kayak.ssm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.kayak.ssm.service.impl
 * @Description: java类作用描述
 * @Author: yangshuai
 * @CreateDate: 2022/6/13 20:50
 * @Version 1.0
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> queryAll() {
        return categoryMapper.selectAll();
    }
}
