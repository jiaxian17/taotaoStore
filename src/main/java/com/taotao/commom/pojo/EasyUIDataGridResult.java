package com.taotao.commom.pojo;

import java.util.List;

/**
 * 返回给页面的数据 json格式
 * @author ibm
 *
 */
public class EasyUIDataGridResult {
    
    private long total;
    private List<?> rows;
    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public List<?> getRows() {
        return rows;
    }
    public void setRows(List<?> rows) {
        this.rows = rows;
    }
    
}
