package com.allen.vipmana.function.impl;

import com.allen.vipmana.dao.AttrsDao;
import com.allen.vipmana.entity.Attrs;
import com.allen.vipmana.function.AttrsFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by allen on 2017/6/6.
 */
@Service
public class AttrsFunctionImpl implements AttrsFunction {

    @Autowired
    AttrsDao attrsDao;

    @Override
    public List<Attrs> qureyByLabelId(int labelId) throws Exception {
        List<Attrs> list=attrsDao.selectById("labelId",labelId);
        return list;
    }
}
