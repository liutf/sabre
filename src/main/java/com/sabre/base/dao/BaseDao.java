package com.sabre.base.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * FileName: BaseDao
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-10
 */
public interface BaseDao<T,ID extends Serializable> extends JpaRepository<T,ID> {

}
