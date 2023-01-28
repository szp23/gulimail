package com.song.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.song.common.utils.PageUtils;
import com.song.gulimail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author songzhipeng
 * @email 1789971989@qq.com
 * @date 2023-01-29 00:41:52
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

