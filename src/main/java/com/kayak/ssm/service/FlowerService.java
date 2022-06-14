package com.kayak.ssm.service;

import com.kayak.ssm.bean.Flower;

import java.util.List;
import java.util.Map;

public interface FlowerService {
    List<Flower> queryAll();

    List<Map<String, String>> queryByCName(String cname);

    int updateFlower(Flower flower);
}
