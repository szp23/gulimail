package com.song.gulimail.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author songzhipeng
 * @email 1789971989@qq.com
 * @date 2023-01-29 00:57:49
 */
@Data
@TableName("undo_log")
public class UndoLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long branchId;
	/**
	 * 
	 */
	private String xid;
	/**
	 * 
	 */
	private String context;
	/**
	 * 
	 */
	private byte[] rollbackInfo;
	/**
	 * 
	 */
	private Integer logStatus;
	/**
	 * 
	 */
	private Date logCreated;
	/**
	 * 
	 */
	private Date logModified;
	/**
	 * 
	 */
	private String ext;

}
