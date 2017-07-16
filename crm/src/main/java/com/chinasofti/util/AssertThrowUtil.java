package com.chinasofti.util;

/**
 * Created by allen on 2017/5/10.
 */
public class AssertThrowUtil {
    public static String assertNotBlank(String mess,String target){
        if(target==null||(target.trim()).length()==0){
            throw new ThisSystemException(mess);
        }
        return target;
    }

    public static String $(String mess,String target){
        return assertNotBlank(mess,target);
    }

    public static void assertNotNull(String mess,Object o){
        if(o==null){
            throw new ThisSystemException(mess);
        }
    }

    public static void assertNull(String mess,Object o){
        if(o!=null){
            throw new ThisSystemException(mess);
        }
    }
    public static void assertEquals(String mess,Object a,Object b){
        if(a==null?a!=b:!a.equals(b)){
            throw new ThisSystemException(mess);
        }
    }
    public static void assertNotEquals(String mess,Object a,Object b){
        if(a==null?a==b:a.equals(b)){
            throw new ThisSystemException(mess);
        }
    }
}
