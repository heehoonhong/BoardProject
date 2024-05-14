package com.codinghoon.BoardProject.repository;

import com.codinghoon.BoardProject.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity,Long> { // Entity 클래스와 Entity 클래스가 가지고 있는 pk의 타입

}
