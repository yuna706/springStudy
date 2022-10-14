package kr.co.km.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Data
@Getter
@Setter
public class BoardVo {
    private int boardSeq;
    private String content;
    private int kindSeq;
    private int userSeq;
    @JsonFormat(pattern="yyyy.MM.dd")
    private Date insertDt;
}
