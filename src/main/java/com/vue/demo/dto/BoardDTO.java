package com.vue.demo.dto;

import java.time.LocalDate;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BoardDTO {

	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private LocalDate regDate;
	private LocalDate updateDate;
	
}
