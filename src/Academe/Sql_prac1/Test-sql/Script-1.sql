 -- SQL 연습
 -- 테이블 생성 
 create table person (
 	num 	int 		primary key,	-- 회원번호
 	name	varchar(30) not null,		-- 이름
 	phone	varchar(50),				-- 전화번호
 	birth	date						-- 생일
 );
 
 -- 테이블 목록 보기
 show tables;
 
 -- 저장
insert into person (num, name, phone, birth) 
 values (1, '홍길동', '010-1111-1111', '2000-1-1');
insert into person (num, name, phone, birth) 
 values (2, '김철수', '010-2222-1111', '2000-3-1');
insert into person (num, name, phone, birth) 
 values (3, '이영희', '010-3333-1111', '2000-11-11');
 
-- 변경내용 영구적으로 반영
commit;
 
-- 테이블 내의 데이터 모두 조회
select * from person;

-- 조건에 맞는 데이터만 조회
select * from person where num = 1;
select * from person where name = '홍길동';

-- 데이터 수정
update person set phone = '010-9999-9999' where num = 2;

-- 데이터 삭제
delete from person where num = 3;

-- 테이블 삭제
drop table person;

 
 