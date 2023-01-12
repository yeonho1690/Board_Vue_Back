package com.vue.demo.controller;

import java.net.URLDecoder;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vue.demo.dao.BoardDAO;
import com.vue.demo.dto.BoardDTO;
import com.vue.demo.service.BoardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class boardController {

	private final BoardService service;

	//게시판 목록 조회
	@GetMapping("/list")
	public List<BoardDTO> boardList(){

		return service.boardAllList();
		
	}	
	
	//게시판 상세 조회
	@GetMapping("/detail/{bno}")
	public BoardDTO boardDetail(@PathVariable("bno") int bno){
		
		return service.boardDetail(bno);
	}
	
	//등록
	@PostMapping("/enroll")
	public List<BoardDTO> boardEnroll(@RequestBody BoardDTO board){
		
		service.boardEnrollAll(board);
		return service.boardAllList();
		   
	}
	
}
