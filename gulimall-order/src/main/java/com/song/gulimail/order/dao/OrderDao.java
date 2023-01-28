package com.song.gulimail.order.dao;

import com.song.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author songzhipeng
 * @email 1789971989@qq.com
 * @date 2023-01-29 00:57:49
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
