package com.allen.vipmana.function;

import com.allen.vipmana.entity.Attrs;

import java.util.List;

/**
 * Created by allen on 2017/6/6.
 */
public interface AttrsFunction {
    //根据标签进行查询对应属性集
    public List<Attrs> qureyByLabelId(int labelId)throws Exception;
}
