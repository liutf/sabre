package com.sabre.demo.domain.entity;

import com.sabre.base.domain.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * FileName: UserEntity
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-10
 */
@Entity
@Table(name = "test_tb")
@Data
public class UserEntity extends BaseEntity {

    private static final long serialVersionUID = -5198549114598909872L;

    private int state;
    @Column(unique = true)
    private String name;
    private String sex;
    private int age;


}
