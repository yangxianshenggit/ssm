package com.kayak.ssm.service.impl;

import com.kayak.ssm.bean.Flower;
import com.kayak.ssm.mapper.FlowerMapper;
import com.kayak.ssm.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: ssm
 * @Package: com.kayak.ssm.service.impl
 * @Description: java类作用描述
 * @Author: yangshuai
 * @CreateDate: 2022/6/13 17:05
 * @Version 1.0
 */
@Service("flowerService")
public class FlowerServiceImpl implements FlowerService {
    @Autowired
    private FlowerMapper flowerMapper;
    @Override
    public List<Flower> queryAll() {
        return flowerMapper.selectAll();
    }

    @Override
    public List<Map<String, String>> queryByCName(String cname) {
        return flowerMapper.queryByCName( cname);
    }

    @Override
    public int updateFlower(Flower flower) {
        return flowerMapper.updateByPrimaryKeySelective(flower);
    }
}
