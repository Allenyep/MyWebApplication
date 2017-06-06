package com.allen.vipmana.function.impl;

import com.allen.common.ThisSystemException;
import com.allen.common.ThisSystemUtil;
import com.allen.vipmana.dao.LabelDao;
import com.allen.vipmana.entity.Label;
import com.allen.vipmana.function.LabelFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by allen on 2017/6/5.
 */
@Service
public class LabelFunctionImpl implements LabelFunction {

    @Autowired
    LabelDao labelDao;


    @Override
    public List<Label> queryAllLabel(int userId) throws Exception {
        List<Label> list= labelDao.selectById("userId",userId);
//        System.out.println(list);
        if(list==null){
            throw new ThisSystemException("查询标签失败");
        }
        return list;
    }

    @Override
    public void insert(Label label) throws Exception {
        labelDao.insert(label);
    }

    @Override
    public void delete(int labelId) throws Exception {
        System.out.println("==============labelId:"+labelId);
        labelDao.delete(labelId);
    }
}
