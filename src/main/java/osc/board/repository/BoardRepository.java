package osc.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import osc.board.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {


}
