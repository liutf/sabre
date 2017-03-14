package com.sabre.base.pojo.entity;

import com.sabre.base.listener.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * FileName: BaseEntity
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-10
 */
@MappedSuperclass
@EntityListeners(EntityListener.class)
@Data
public abstract class BaseEntity implements Serializable{

    private static final long serialVersionUID = 2698277156510822873L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, updatable = false)
    private Timestamp createDate;

    @Column(nullable = false)
    private Timestamp modifyDate;

    private int state;

}
