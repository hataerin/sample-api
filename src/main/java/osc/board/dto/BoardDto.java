package osc.board.dto;

import lombok.*;
import osc.board.domain.Board;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor //필드변수 생성자
public class BoardDto {

    private String title;
    private String content;
    private String writer;

    private LocalDateTime createDate;
    private LocalDateTime updateDate;


    public Board toEntity(){
        Board board = Board
                .builder()
                .writer(this.writer)
                .title(this.title)
                .content(this.content)
                .build();
        return board;
    }

    @Builder
    public BoardDto(
            String writer,
            String title,
            String content) {

        this.writer = writer;
        this.title = title;
        this.content = content;
    }
}


