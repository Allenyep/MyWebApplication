package com.allen.common;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by allen on 2017/5/23.
 */
public interface AbstractDao<T> {
    void insert(T t)throws Exception;
    void update(T t)throws Exception;
    void delete(@Param("key") int key)throws Exception;
    T select(@Param("key") String ukfield,@Param("value") Object value)throws Exception;
    boolean exsits(@Param("key") String ukfield,@Param("value") Object value)throws Exception;
    List<T> selectLike(@Param("key") String key)throws Exception;
    List<T> selectById(@Param("key") String key,@Param("value") Object value)throws Exception;
    List<T> selectAll()throws Exception;
}
