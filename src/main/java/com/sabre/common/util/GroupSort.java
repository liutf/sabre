package com.sabre.common.util;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * FileName: GroupSort
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-02-22
 */
@Slf4j
public class GroupSort {

    /**
     * 分組依據接口，用于集合分組時，獲取分組依據
     * @author	ZhangLiKun
     * @title	GroupBy
     * @date	2013-4-23
     */
    public interface GroupBy<T> {
        T groupByType(Object obj) ;
    }

    /**
     *
     * @param colls
     * @param gb
     * @return
     */
    public static final <T extends Comparable<T> ,D> Map<T ,List<D>> group(Collection<D> colls , GroupBy<T> gb){
        if(colls == null || colls.isEmpty()) {
            log.error("分组集合不能为空!");
            return null ;
        }
        if(gb == null) {
            log.error("分组依据接口不能为Null!");
            return null ;
        }
        Iterator<D> iter = colls.iterator() ;
        Map<T ,List<D>> map = new HashMap<T, List<D>>() ;
        while(iter.hasNext()) {
            D d = iter.next() ;
            T t = gb.groupByType(d) ;
            if(map.containsKey(t)) {
                map.get(t).add(d) ;
            } else {
                List<D> list = new ArrayList<D>() ;
                list.add(d) ;
                map.put(t, list) ;
            }
        }
        return map ;
    }

}
