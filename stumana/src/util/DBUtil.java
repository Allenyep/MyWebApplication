package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.UUID;

/**
 * 数据库连接类
 * Created by Allen on 2017/2/27.
 */
public class DBUtil {
    private static final String USER = "pig";
    private static final String PASSWROD = "123456";
    private static final String URL="jdbc:mysql://115.159.216.56:3306/tale?useUnicode=true&characterEncoding=utf-8";
    private static final ThreadLocal<Connection> THREAD_LOCAL=new ThreadLocal<Connection>();

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException{
        Connection connection=THREAD_LOCAL.get();
        if(connection==null||connection.isClosed()){
            connection = DriverManager.getConnection(URL, USER, PASSWROD);
            THREAD_LOCAL.set(connection);
        }
        return connection;
    }

    public static void closeConnection(){
        try{
            Connection connection=THREAD_LOCAL.get();
            if(connection!=null&&!connection.isClosed()){
                connection.close();
            }
        }catch(Exception e){}
    }
    /**
     * 转换utilDate为sqlDate
     * @param d
     * @return
     */
    public static java.sql.Date toSqlDate(java.util.Date d){
        return new java.sql.Date(d.getTime());
    }
    /*
        设置UUid
    */
    public static String uuid(){
        String uuid= UUID.randomUUID().toString();
        char[] cs=new char[32];
        int j=0;
        for(int i=uuid.length();i-->0;){
            if(uuid.charAt(i)!='-'){
                cs[j++]=uuid.charAt(i);
            }
        }
        return new String(cs);
    }
}
