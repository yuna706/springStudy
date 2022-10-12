package kr.co.km.vo;

import java.sql.Timestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserVo {
	int userSeq;
	String name;
	Timestamp insertDt;
}