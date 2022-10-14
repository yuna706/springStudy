package kr.co.km.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Data
@Getter
@Setter
public class TodoListDto {
    private int boardSeq;
    private String content;
    @JsonFormat(pattern="yyyy.MM.dd")
    private Date insertDt;

    // 검색 파라미터용
    private List<Integer> kindSeqList;

    private int kindSeq;
    private String krNm;
    private String enNm;

    private int userSeq;
    private String name;
}
