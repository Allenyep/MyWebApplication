package com.allen.vipmana.function;

import com.allen.vipmana.entity.Attrs;

import java.util.List;

/**
 * Created by allen on 2017/6/6.
 */
public interface AttrsFunction {
    //根据标签进行查询对应属性集
    public List<Attrs> qureyByLabelId(int labelId)throws Exception;

    //插入新标签
    public void insert(String attrName, String attrURL, int labelId)throws Exception;

    //更新标签
    public void update(String attrName,String attrURL,int attrId)throws Exception;

}
