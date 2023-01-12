package com.vue.demo.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.vue.demo.dao.BoardDAO;
import com.vue.demo.dto.BoardDTO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{

	private final BoardDAO boardDao;

	@Override
	public List<BoardDTO> boardAllList() {

		return boardDao.boardList();
	
	}
	
	@Override
	public void boardEnrollAll(BoardDTO board) {
		
		boardDao.boardEnroll(board);
		
	}
	
	//상세 조회
	@Override
	public BoardDTO boardDetail(int bno) {
		
		return boardDao.boardDetail(bno);
		
	}
	
	
	
}
