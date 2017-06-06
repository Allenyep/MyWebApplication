package com.allen.vipmana.function;

import com.allen.vipmana.entity.Label;

import java.util.List;

/**
 * Created by allen on 2017/6/5.
 */
public interface LabelFunction {
    //查询用户对应所有栏目
    public List<Label> queryAllLabel(int userId)throws Exception;

    //插入新栏目
    public void insert(Label label)throws Exception;

    //删除栏目
    public void delete(int labelId)throws Exception;
}
