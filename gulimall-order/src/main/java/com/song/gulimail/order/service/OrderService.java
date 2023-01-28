package com.song.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.song.common.utils.PageUtils;
import com.song.gulimail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author songzhipeng
 * @email 1789971989@qq.com
 * @date 2023-01-29 00:57:49
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

