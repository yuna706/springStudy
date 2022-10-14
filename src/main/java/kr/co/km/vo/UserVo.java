package kr.co.km.vo;

import java.sql.Date;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserVo {
	private int userSeq;
	private String name;
	@JsonFormat(pattern="yyyy.MM.dd")
	private Date insertDt;
}