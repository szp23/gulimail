package com.song.gulimail.order.dao;

import com.song.gulimail.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author songzhipeng
 * @email 1789971989@qq.com
 * @date 2023-01-29 00:57:49
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}