package kr.co.km.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BoardKindVo {
    private int kindSeq;
    private String krNm;
    private String enNm;
}