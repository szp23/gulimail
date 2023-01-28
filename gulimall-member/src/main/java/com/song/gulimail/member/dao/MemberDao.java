package com.song.gulimail.member.dao;

import com.song.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author songzhipeng
 * @email 1789971989@qq.com
 * @date 2023-01-29 00:41:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
