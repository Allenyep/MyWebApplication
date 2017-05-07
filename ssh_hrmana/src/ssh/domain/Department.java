package ssh.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by allen on 2017/5/7.
 */
public class Department {
    private int did;
    private String dname;
    private String ddesc;

    private Set<Employee> employees=new HashSet<Employee>();

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDdesc() {
        return ddesc;
    }

    public void setDdesc(String ddesc) {
        this.ddesc = ddesc;
    }
}
