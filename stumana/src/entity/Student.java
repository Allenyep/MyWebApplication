package entity;

/**
 * 学生信息实体 学号 姓名 性别 生日 专业
 * Created by allen on 2017/12/26.
 */
public class Student {
    private String sno;
    private String sname;
    private String ssex;
    private String sdate;
    private String smajor;

    public Student(String sno, String sname, String ssex, String sdate, String smajor) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.sdate = sdate;
        this.smajor = smajor;
    }

    public Student() {
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getSmajor() {
        return smajor;
    }

    public void setSmajor(String smajor) {
        this.smajor = smajor;
    }

    @Override
    public String toString() {
        return "学生{" +
                "学号='" + sno + '\'' +
                ", 姓名='" + sname + '\'' +
                ", 性别='" + ssex + '\'' +
                ", 生日='" + sdate + '\'' +
                ", 专业='" + smajor + '\'' +
                '}';
    }
}
