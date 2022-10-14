package kr.co.km.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Data
@Getter
@Setter
public class TodoListDto {
    int boardSeq;
    String content;
    Timestamp insertDt;

    int kindSeq;
    String krNm;
    String enNm;

    int userSeq;
    String name;
}
