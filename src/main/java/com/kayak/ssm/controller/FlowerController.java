package com.kayak.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kayak.ssm.bean.Category;
import com.kayak.ssm.bean.Flower;
import com.kayak.ssm.service.CategoryService;
import com.kayak.ssm.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: ssm
 * @Package: com.kayak.ssm.controller
 * @Description: java类作用描述
 * @Author: yangshuai
 * @CreateDate: 2022/6/13 17:26
 * @Version 1.0
 */
@Controller
@RequestMapping("/FlowerController")
public class FlowerController {
    @Autowired
    private FlowerService flowerService;
    @Autowired
    private CategoryService categoryService;
    private int pageNum = 3;

    //测试
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Flower> queryAll() {
        return flowerService.queryAll();
    }

    //分页条件查询
    @RequestMapping(value = {"/queryByCName"})
    @ResponseBody
    public Map<String, Object> queryByCName(
            @RequestParam(defaultValue = "1") int page,
            String cname) {
        //开启分页
        PageHelper.startPage(page, pageNum);
        List<Map<String, String>> list = flowerService.queryByCName(cname);
        PageInfo<Map<String, String>> mapPageInfo = new PageInfo<>(list);
        List<Category> list1 = categoryService.queryAll();
        Map<String, Object> map=new HashMap<>();
        map.put("result", mapPageInfo.getList());
        map.put("lastPage", mapPageInfo.getLastPage());
        map.put("cnames", list1);
        return map;
    }

    @RequestMapping("/updateFlower")
    public String  updateFlower(Flower flower){
        flowerService.updateFlower(flower);
        return "forward:/FlowerController/queryByCName";
    }
}
