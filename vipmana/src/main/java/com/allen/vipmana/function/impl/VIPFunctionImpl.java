package com.allen.vipmana.function.impl;

import com.allen.common.ThisSystemException;
import com.allen.vipmana.dao.VIPDao;
import com.allen.vipmana.entity.VIP;
import com.allen.vipmana.function.VIPFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.allen.common.AssertThrowUtil.$;

/**
 * Created by allen on 2017/5/30.
 */
@Service
public class VIPFunctionImpl implements VIPFunction{
    @Autowired
    VIPDao vipDao;

    @Override
    public VIP queryVip(String vcode) throws Exception {
        //1验证参数
        vcode=$("账号必须填写",vcode);
        //2业务处理
        VIP vip=vipDao.select("vcode",vcode);

        if(vip==null){
            throw new ThisSystemException("查询失败，没有这个客户:"+vcode);
        }
        //3封装业务
        return vip;
    }


}
