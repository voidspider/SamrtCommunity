package com.sc_core.common.model;



import com.github.pagehelper.PageInfo;

import java.util.List;


public class QueryResult<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<T> list;

    /**
     * 将PageHelper分页后的list转为分页信息
     */
    public static <T> QueryResult<T> restPage(int pageNum,int pageSize,List<T> list1,List<T> list) {
        QueryResult<T> result = new QueryResult<T>();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        result.setTotalPage((list1.size()+pageSize-1)/pageSize);
        result.setPageNum(pageNum);
        result.setPageSize(pageSize);
        result.setTotal((long)list1.size());
        result.setList(pageInfo.getList());
        return result;
    }
    public static <T> QueryResult<T> restPage(List<T> list) {
        QueryResult<T> result = new QueryResult<T>();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

    /**
     * 将PageHelper分页后的list转为分页信息
     */
    public static <T> QueryResult<T> restPage(PageInfo<T> pageInfo) {
        QueryResult<T> result = new QueryResult<T>();
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
