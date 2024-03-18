package com.example.common.config;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.common.dto.PageDetailDto;

import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author John
 *
 * @param <T>
 */
@Getter
@Setter
public class PageDetailData<T> {

    /**
     * 分頁數據
     */
    private List<T> records;

    /**
     * 當前頁碼
     */
    private Integer page;

    /**
     * 總頁數
     */
    private Integer pages;

    /**
     * 每頁數量
     */
    private Integer limit;

    private List<String> orderby;
    
    private List<String> sort;

    /**
     * 總條數
     */
    private Long total;

    /**
     * 將SpringData分頁後的list轉為分頁訊息
     */
    public static <T> PageDetailData<T> build(PageDetailDto<T> pageInfo) {
        PageDetailData<T> result = new PageDetailData<>();
        Page p = pageInfo.getPage();
        result.setPages(p.getTotalPages());
        result.setPage(p.getNumber());
        result.setLimit(p.getSize());
        result.setTotal(p.getTotalElements());
        result.setOrderby(pageInfo.getOrderby());
        result.setSort(pageInfo.getSort());
        result.setRecords(pageInfo.getContentDto());
        
        return result;
    }
}
