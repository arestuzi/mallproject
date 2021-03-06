package com.qingcheng.entity;

import java.io.Serializable;
import java.util.List;
/**
 * 分页结果
 * @param <T>
 */

public class PageResult<T> implements Serializable {

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    private Long total;
    private List<T> rows;

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
}
