package com.example.common.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageDetailDto<DTO> {
	private Page page;
	private List<DTO> contentDto;
	private List<String> orderby = new ArrayList<>();
	private List<String> sort = new ArrayList<>();
	
	public PageDetailDto(Page page, List<DTO> contentDto , String orderby, String sort) {
		this.page = page;
		this.contentDto = contentDto;
		this.orderby.add(orderby);
		this.sort.add(sort);
	}

    public PageDetailDto(Page page, List<DTO> contentDto , List<String> orderby, List<String> sort) {
        this.page = page;
        this.contentDto = contentDto;
        this.orderby = orderby;
        this.sort = sort;
    }
}
