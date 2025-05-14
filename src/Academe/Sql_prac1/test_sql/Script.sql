-- [게시판 예제]

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

-- 'aaa'가 작성한 글
select * from board where id = 'aaa';
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








