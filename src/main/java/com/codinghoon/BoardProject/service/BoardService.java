package com.codinghoon.BoardProject.service;

import com.codinghoon.BoardProject.dto.BoardDTO;
import com.codinghoon.BoardProject.entity.BoardEntity;
import com.codinghoon.BoardProject.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// DTO -> Entity (Entity Class)
// Entity -> DTO (DTO Class)


@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) { // DTO -> Entity
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }

    public List<BoardDTO> findAll() { // Entity -> DTO
        List<BoardEntity> boardEntityList=boardRepository.findAll();
        List<BoardDTO> boardDTOList=new ArrayList<>();
        for(Bo)
    }
}
