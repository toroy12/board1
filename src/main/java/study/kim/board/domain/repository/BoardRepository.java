package study.kim.board.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.kim.board.domain.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}