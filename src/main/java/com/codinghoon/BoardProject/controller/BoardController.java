package com.codinghoon.BoardProject.controller;

import com.codinghoon.BoardProject.dto.BoardDTO;
import com.codinghoon.BoardProject.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/save") // post 방식으로 했기 때문에
    public String save(@ModelAttribute BoardDTO boardDTO){
        System.out.println("boardDTO = " + boardDTO);
        boardService.save(boardDTO);
        return "index";
    }

    @GetMapping("/")
    public String findAll(Model model){ // 데이터를 가져와야 할 때 모델 객체 사용

        // DB에서 전체 게시글 데이터를 가져와서 list.html에 보여준다.
        List<BoardDTO> boardDTOList=boardService.findAll();
        model.addAttribute("boardList",boardDTOList);
        return "list";
    }
}
