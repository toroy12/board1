package study.kim.board.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.kim.board.domain.entity.File;

public interface FileRepository extends JpaRepository<File, Long> {
}