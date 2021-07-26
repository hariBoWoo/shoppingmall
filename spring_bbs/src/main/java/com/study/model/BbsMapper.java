package com.study.model;

import java.util.List;
import java.util.Map;

public interface BbsMapper {
	int total(Map map);
	List<BbsDTO> list(Map map);
	int create(BbsDTO dto);
	void upViewcnt(int bbsno);
	BbsDTO read(int bbsno);
	int passCheck(Map map);
	int update(BbsDTO dto);
	BbsDTO readReply(int bbsno);
	void upAnsnum(Map map);
	int createReply(BbsDTO dto);
	int checkRefnum(int bbsno);
	int delete(int bbsno);
}
