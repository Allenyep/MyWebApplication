package com.allen.vipmana.function;

import com.allen.vipmana.entity.VIP;

/**
 * Created by allen on 2017/5/30.
 */
public interface VIPFunction {
    public VIP queryVip(String vcode)throws Exception;
}
