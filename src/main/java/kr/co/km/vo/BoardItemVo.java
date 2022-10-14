package kr.co.km.vo;

import lombok.Data;

@Data
public class BoardItemVo {
    BoardVo boardVo;
    BoardKindVo boardKindVo;
    UserVo userVo;
}
