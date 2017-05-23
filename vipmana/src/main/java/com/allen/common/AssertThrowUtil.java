package com.allen.common;

/**
 * Created by allen on 2017/5/10.
 */
public class AssertThrowUtil {
    public static String throwIfBlank(String mess,String target){
        if(target==null||(target.trim()).length()==0){
            throw new ThisSystemException(mess);
        }
        return target;
    }
    public static String $(String mess,String target){
        return throwIfBlank(mess,target);
    }
}
