package com.example.common.dto;

import java.util.List;

import org.springframework.data.domain.Page;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageDto<DTO> {
	private Page page;
	private List<DTO> contentDto;

	public PageDto(Page page, List<DTO> contentDto) {
		this.page = page;
		this.contentDto = contentDto;
	}
}
