package entity;

import java.util.List;

/**
 * 分页结果类
 * @param <T>
 */
public class PageResult<T> {

    private Long total;// 总条数
    private List<T> rows;// 数据

    public PageResult(Long total, List<T> rows)     {
        this.total = total;
        this.rows = rows;
    }

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
}
