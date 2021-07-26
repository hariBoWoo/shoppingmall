CREATE TABLE bbs ( 
  bbsno    NUMBER(7)       NOT NULL,   -- 글 일련 번호, -9999999 ~ +9999999 
  wname   VARCHAR(20)    NOT NULL,   -- 글쓴이 
  title        VARCHAR(100)  NOT NULL,   -- 제목(*) 
  content   VARCHAR(4000) NOT NULL,  -- 글 내용 
  passwd   VARCHAR(15)     NOT NULL,  -- 비밀 번호 
  viewcnt   NUMBER(5)       DEFAULT 0,  -- 조회수, 기본값 사용 
  wdate     DATE               NOT NULL,  -- 등록 날짜, sysdate 
  grpno     NUMBER(7)       DEFAULT 0, -- 부모글 번호 
  indent    NUMBER(2)       DEFAULT 0,  -- 답변여부,답변의 깊이
  ansnum  NUMBER(5)       DEFAULT 0,  -- 답변 순서 
  PRIMARY KEY (bbsno)  
); 