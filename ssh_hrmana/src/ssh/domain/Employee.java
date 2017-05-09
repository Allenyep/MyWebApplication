package ssh.domain;

import java.util.Date;

/**
 * Created by allen on 2017/5/7.
 */
public class Employee {
    private int eid;
    private String ename;
    private String sex;
    private Date birthday;
    private Date joinDate;
    private String eno;
    private String username;
    private String password;
    //fk
    private Department department;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", joinDate=" + joinDate +
                ", eno='" + eno + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", department=" + department +
                '}';
    }
}
