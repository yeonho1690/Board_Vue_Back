package com.vue.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.vue.demo.dto.BoardDTO;

@Mapper
public interface BoardDAO{

	//조회
	List<BoardDTO> boardList();
	//상세 조회
	BoardDTO boardDetail(int bno);
	//등록
	void boardEnroll(BoardDTO board);
	//수정
	//삭제
}
