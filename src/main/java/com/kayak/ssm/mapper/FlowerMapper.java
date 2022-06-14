package com.kayak.ssm.mapper;

import com.kayak.ssm.bean.Flower;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface FlowerMapper extends Mapper<Flower> {
    List<Map<String, String>> queryByCName(@Param("cname") String cname);
}
