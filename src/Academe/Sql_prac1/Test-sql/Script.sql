-- [게시판 예제]

USE member;


-- 회원 정보
create table member (
	id			varchar(30)		primary key,	-- 사용자 아이디
	password	varchar(100) 	not null,		-- 로그인 비밀번호
	name		varchar(30) 	not null,		-- 사용자 이름
	email		varchar(50),					-- 이메일 주소
	usertype	varchar(10) 	default 'user' 
				check (usertype in ('admin', 'user', 'guest')),	
				-- 사용자 권한
	isactive	tinyint 		default 1 
				check (isactive in (1, 0)) 	
				-- 계정 상태 (1:정상, 0:비활성)
);

insert into member values ('aaa', '111', '홍길동', 'aaa@aaa.com', 'admin', 1);
insert into member (id, password, name, email) values ('bbb', '222', '김철수', 'bbb@bbb.com');
insert into member (id, password, name) values ('ccc', '333', '이영희');

-- 게시판 글
create table board (
	boardnum 	integer auto_increment primary key, -- 게시글 번호
	id 			varchar(30),						-- 작성자 아이디
	title		varchar(1000) 	not null,			-- 글제목
	contents	mediumtext 		not null,			-- 글내용
	viewcount	integer			default 0,			-- 조회수
	inputdate	timestamp		default current_timestamp,	-- 작성시간
	constraint foreign key (id) references member(id) on delete set null
);

insert into board (id, title, contents) values ('aaa', '글제목', '글내용');
insert into board (id, title, contents) values ('bbb', '글제목222', '글내용222');


-- 댓글
create table reply (
	replynum	integer auto_increment primary key, 	-- 리플번호
	boardnum	integer,								-- 본문글번호
	id			varchar(30),							-- 작성자 아이디
	replytext	varchar(2000) not null,					-- 리플내용
	inputdate	timestamp default current_timestamp,	-- 작성시간
	constraint foreign key (boardnum) references board(boardnum) on delete cascade,
	constraint foreign key (id) references member(id) on delete set null
);

insert into reply (boardnum, id, replytext) values (1, 'bbb', '리플내용');

-- 전체 보기
select * from member;
select * from board;
select * from reply;

-- 수정
-- 아이디가 'aaa'인 회원의 이름을 '관리자'로, 권한을 'admin'으로 변경
update member set name='관리자', usertype='admin' where id='aaa';
-- 1번 글의 제목을 '안녕하세요'로 변경
update board set title='안녕하세요' where boardnum = 1;
-- 1번 글의 조회수를 10으로 변경
update board set viewcount = 10 where boardnum = 1;
-- 1번 글의 조회수를 1 증가
update board set viewcount = viewcount + 1 where boardnum = 1;

-- 삭제
-- 2번 게시글 삭제
delete from board where boardnum=2;

-- 조회

-- '홍길동'가 작성한 글
select * from board where id = '홍길동';
-- 제목에 '테스트'가 포함된 글
select * from board where title like '%테스트%';
-- 제목 또는 내용에 '테스트'가 포함된 글
select * from board where title like '%테스트%' or contents like '%테스트%';
-- 최근 7일 이내에 올라온 글을 조회수가 높은 순으로
select * from board where inputdate >= now() - interval 7 day order by viewcount desc;
select * from board
where inputdate >= date_add(now(), interval -7 day)
order by viewcount desc;
-- 사용자 'aaa', 'bbb', 'ccc' 3사람이 작성한 글
select * from board where id in ('aaa', 'bbb', 'ccc');

-- 1번 글에 달린 리플을 최신순으로
select * from reply where boardnum = 1 order by inputdate desc;

-- 'aaa'가 작성한 글의 평균 조회수
select avg(viewcount) from board where id = 'aaa';

-- 'aaa'가 올해 5월에 작성한 글의 개수
select count(*) from board 
where id = 'aaa' and month(inputdate) = 5 and year(inputdate) = year(now());

-- 각 사용자별 게시글 수
select id, count(*) from board group by id;

-- 각 게시글에 달린 리플 수 
select boardnum, count(*) from reply group by boardnum;

-- 서브쿼리
select 컬럼명 from 테이블명 where 조건;

-- 게시글의 번호와 제목, 작성자이름 출력
select boardnum, title, 
(select name from member m where member.id = board.id) name  
from board b;

-- 관리자가 작성한 글 중에 최근글 3개
select * from board
where id in (select id from member where usertype = 'admin') 
order by inputdate desc limit 3;

select * from board
where (select usertype from member where member.id = board.id) = 'admin'
order by inputdate desc limit 3;

-- 조인
-- 크로스 조인
select * from member, board;
-- Inner join
select * from member, board where member.id = board.id;
select * from member join board on member.id = board.id;

-- 작성자 이름과 글 제목
select name, title from member join board on member.id = board.id;
-- 이름, 제목, 조회수를 조회수가 10 이상인 글만 출력
select * from member, board where member.id = board.id and viewcount >= 10;









insert into member values 
('user01', 'pw01', '홍길동', 'user01@test.com', 'user', 1),
('user02', 'pw02', '김영희', 'user02@test.com', 'guest', 1),
('user03', 'pw03', '이철수', 'user03@test.com', 'admin', 1),
('user04', 'pw04', '박민수', 'user04@test.com', 'user', 0),
('user05', 'pw05', '최수정', 'user05@test.com', 'user', 1),
('user06', 'pw06', '한지민', 'user06@test.com', 'guest', 0),
('user07', 'pw07', '강호동', 'user07@test.com', 'user', 1),
('user08', 'pw08', '유재석', 'user08@test.com', 'admin', 1),
('user09', 'pw09', '장원영', 'user09@test.com', 'user', 1),
('user10', 'pw10', '손흥민', 'user10@test.com', 'guest', 1);



insert into board (id, title, contents, viewcount, inputdate) values
('user01', '안녕하세요1', '내용입니다1', 5, now() - interval 1 day),
('user02', '테스트 글입니다2', '테스트 본문입니다2', 2, now() - interval 2 day),
('user03', '중요 공지입니다', '공지 내용입니다', 20, now() - interval 3 day),
('user04', '문의합니다', '문의 내용입니다', 0, now() - interval 1 day),
('user05', '글제목입니다5', '글내용입니다5', 13, now() - interval 4 day),
('user06', '질문드립니다6', '궁금한 점 있습니다6', 8, now() - interval 5 day),
('user07', '후기 작성7', '후기입니다7', 15, now() - interval 2 day),
('user08', '리뷰입니다8', '리뷰 내용입니다8', 3, now() - interval 6 day),
('user09', '제안합니다9', '제안내용입니다9', 0, now() - interval 3 day),
('user10', '테스트10', '테스트 내용입니다10', 7, now() - interval 1 day),
('user01', '공지사항11', '공지11입니다', 11, now() - interval 7 day),
('user02', '이벤트 안내12', '이벤트 설명입니다12', 6, now() - interval 4 day),
('user03', '업데이트 안내13', '업데이트 내용입니다13', 4, now() - interval 2 day),
('user04', '에러 보고14', '에러가 발생했습니다14', 1, now() - interval 8 day),
('user05', '기능 요청15', '요청 내용입니다15', 9, now() - interval 6 day),
('user06', '사용기16', '사용기 내용입니다16', 17, now() - interval 3 day),
('user07', '후기17', '후기입니다17', 12, now() - interval 1 day),
('user08', '사용법 안내18', '사용법입니다18', 5, now() - interval 9 day),
('user09', '개선 사항19', '개선이 필요합니다19', 3, now() - interval 10 day),
('user10', '서비스 만족도 조사20', '설문입니다20', 10, now());



insert into reply (boardnum, id, replytext) values
(1, 'user02', '좋은 글이네요'),
(2, 'user03', '감사합니다'),
(3, 'user04', '잘 읽었습니다'),
(4, 'user05', '궁금한 점이 있습니다'),
(5, 'user06', '좋은 정보 감사합니다'),
(6, 'user07', '도움이 되었습니다'),
(7, 'user08', '잘 보고 갑니다'),
(8, 'user09', '좋아요!'),
(9, 'user10', '의견 동의합니다'),
(10, 'user01', '질문이 있습니다'),
(11, 'user02', '알려주셔서 감사합니다'),
(12, 'user03', '좋은 정보네요'),
(13, 'user04', '내용 확인했습니다'),
(14, 'user05', '추천합니다'),
(15, 'user06', '문의드립니다'),
(16, 'user07', '잘 이해가 안돼요'),
(17, 'user08', '추가 설명 부탁드려요'),
(18, 'user09', '글이 좋아요'),
(19, 'user10', '응원합니다'),
(20, 'user01', '고맙습니다');
