package com.example.common.config;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.common.dto.PageDto;

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
public class PageData<T> {
    /**
     * 當前頁碼
     */
    private Integer page;
    /**
     * 每頁數量
     */
    private Integer limit;
    /**
     * 總頁數
     */
    private Integer pages;
    /**
     * 總條數
     */
    private Long total;
    /**
     * 分頁數據
     */
    private List<T> records; 
    

    /**
     * 將SpringData分頁後的list轉為分頁訊息
     */
    public static <T> PageData<T> build(PageDto<T> pageInfo) {
        PageData<T> result = new PageData<>();
        Page p = pageInfo.getPage();
        result.setPages(p.getTotalPages());
        result.setPage(p.getNumber());
        result.setLimit(p.getSize());
        result.setTotal(p.getTotalElements());
        result.setRecords(pageInfo.getContentDto());
        return result;
    }
}
