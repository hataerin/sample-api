package osc.board.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import osc.board.dto.BoardDto;

import java.time.LocalDateTime;
@Getter
@Entity
@NoArgsConstructor
@Table(name = "board")
public class Board extends BaseTime{

    @Id //pk맵핑
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pk값 알아서 생성
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    String writer;

    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    String content;

    @Builder
    public Board(
            Long id,
            String writer,
            String title,
            String content,
            LocalDateTime createDate,
            LocalDateTime updateDate) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        createDate = createDate;
        updateDate = updateDate;
    }

    public void update(BoardDto boardDto){
        this.title = boardDto.getTitle();
        this.content = boardDto.getContent();
        this.writer = boardDto.getWriter();
    }
}
