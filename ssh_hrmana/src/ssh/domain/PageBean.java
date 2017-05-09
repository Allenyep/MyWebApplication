package ssh.domain;

import java.util.List;

/**
 * Created by allen on 2017/5/9.
 */
//分页封装
public class PageBean<T> {
    private int currPage;//当前页数
    private int pageSize;//每页记录数
    private int totalPage;//总记录数
    private int totalCount;//总页数

    private List<T> list;//每页显示的数据

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
