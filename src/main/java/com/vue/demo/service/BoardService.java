package com.vue.demo.service;

import java.util.List;
import com.vue.demo.dto.BoardDTO;


public interface BoardService {

	List<BoardDTO> boardAllList();
	void boardEnrollAll(BoardDTO board);
	//์์ธ ์กฐํ
	BoardDTO boardDetail(int bno);
}
