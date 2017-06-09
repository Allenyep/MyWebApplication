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

    @Override
    public void insert(String attrName, String attrURL, int labelId) throws Exception {
        Attrs attr=new Attrs();
        attrName=new String(attrName.getBytes("ISO-8859-1"),"UTF-8");
        System.out.println(labelId);
        attr.setAttrName(attrName);
        attr.setAttrURL(attrURL);
        attr.setLabelId(labelId);
        attrsDao.insert(attr);

    }

    @Override
    public void update(String attrName, String attrURL, int attrId) throws Exception {
        Attrs attr=new Attrs();
        attr.setAttrId(attrId);
        attrName=new String(attrName.getBytes("ISO-8859-1"),"UTF-8");
        attr.setAttrName(attrName);
        attr.setAttrURL(attrURL);
        attrsDao.update(attr);
    }

    @Override
    public List<Attrs> queryAllAttr() throws Exception {
        return attrsDao.selectAll();
    }


}
