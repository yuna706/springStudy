package kr.co.km.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Data
@Getter
@Setter
public class TodoListDto {
    int boardSeq;
    String content;
    Timestamp insertDt;

    // 검색 파라미터용
    List<Integer> kindSeqList;

    int kindSeq;
    String krNm;
    String enNm;

    int userSeq;
    String name;
}
