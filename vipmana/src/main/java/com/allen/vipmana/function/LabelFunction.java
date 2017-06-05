package com.allen.vipmana.function;

import com.allen.vipmana.entity.Label;

import java.util.List;

/**
 * Created by allen on 2017/6/5.
 */
public interface LabelFunction {
    public List<Label> queryAllLabel(int userId)throws Exception;
}
