package kr.co.km.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Data
@Getter
@Setter
public class BoardVo {
    int boardSeq;
    String content;
    int kindSeq;
    int userSeq;
    Timestamp insertDt;
}
