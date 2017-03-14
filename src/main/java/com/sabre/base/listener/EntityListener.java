
package com.sabre.base.listener;


import com.sabre.base.pojo.entity.BaseEntity;
import com.sabre.common.util.TimeUtil;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.sql.Timestamp;

/**
 * Listener - 创建日期、修改日期处理
 * 
 * 
 * 
 */
public class EntityListener {

	/**
	 * 保存前处理
	 * 
	 * @param entity
	 *            基类
	 */
	@PrePersist
	public void prePersist(BaseEntity entity) {
		Timestamp timeStamp = TimeUtil.getSysDateTimeStamp();
		entity.setCreateDate(timeStamp);
		entity.setModifyDate(timeStamp);
		entity.setState(1);
	}

	/**
	 * 更新前处理
	 * 
	 * @param entity
	 *            基类
	 */
	@PreUpdate
	public void preUpdate(BaseEntity entity) {
		entity.setModifyDate(TimeUtil.getSysDateTimeStamp());
	}

}