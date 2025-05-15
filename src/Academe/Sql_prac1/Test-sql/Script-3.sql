create table student (
	num		int 	auto_increment primary key,	-- 학생 번호
	name	varchar(30) not null,				-- 이름
	phone	varchar(20),						-- 전화번호
	address	varchar(200),						-- 주소
	kor		tinyint 
			default 0 check (kor between 0 and 100), -- 국어점수
	eng 	tinyint
			default 0 check (eng between 0 and 100), -- 영어점수
	mat 	tinyint
			default 0 check (mat between 0 and 100), -- 수학점수
	birth	date,			-- 생일
	createdate 	timestamp default current_timestamp	-- 저장시간	
);

-- 저장 예
insert into student 
	(name, phone, address, kor, eng, mat, birth) 
values 
	('홍길동', '010-1111-1111', '부산시 중구 중앙동 111', 100, 90, 85, '2000-1-1');

insert into student 
	(name, phone, address, kor, eng, mat) 
values 
	('김길동', '010-2222-1111', '부산시 222', 15, 30, 85);

insert into student 
	(name, phone, address, kor, eng, mat) 
values 
	('김영희', '010-2222-3333', '부산시 333', 80, 70, 85);
insert into student 
	(name, phone, address, kor, eng, mat) 
values 
	('이영수', '010-2222-4444', '서울시 111', 77, 88, 66);

insert into student (name) values ('김철수');

-- 모두 조회
select * from student;

-- 수정
-- 번호가 2번인 학생의 전화번호를 '010-1234-5678', 생일을 1998년3월22일로 수정
update student set phone='', birth='' where num = 2;

-- 삭제
-- 이름이 '김철수'인 학생을 삭제
delete from student where name = '김철수';

-- 전체 삭제
delete from student;	-- DML. 데이터만 삭제. auto_increment 유지.
truncate table student; -- DDL. 데이터만 삭제. auto_increment 초기화.
drop table student;		-- DDL. 테이블까지 삭제.

-- 조회

-- 일부 열만 조회
select num, name, phone from student;
-- 계산 결과 조회
select name, kor + 1 from student;
select name, (kor + eng + mat) / 3 from student;

-- 조건에 맞는 행만 조회

-- 번호가 3번 이상인 학생
select * from student where num >= 3;
-- 국어점수가 70점 이상인 학생의 번호와 이름
select num, name from student where kor >= 70;
-- 국어점수와 영어점수가 모두 70점 이상인 학생의 번호와 이름
select num, name from student where kor >= 70 and eng >= 70;
-- 40점 미만은 과락이다. 과락이 하나라도 있는 학생
select * from student where kor < 40 or eng < 40 or mat < 40;
-- 전과목이 각각 90점 이상인 학생
select * from student where kor >= 90 and eng >= 90 or mat >= 90;
-- 평균 60점 이상이면서 과락이 없는 학생
select * from student 
where 
	(kor + eng + mat) / 3 >= 60 
	and kor >= 40 and eng >= 40 or mat >= 40;

-- 평균점수가 80점 이상인 학생들의 이름, 국어, 영어, 수학점수와 평균점수
select
	name,
	(kor + eng + mat) / 3 average
from
	student s
where
	(kor + eng + mat) / 3 >= 80;

-- 국어점수가 50 ~ 80점인 학생
select * from student where kor >= 50 and kor <= 80;
select * from student where kor between 50 and 80;
select * from student where not (kor < 50 or kor > 80);

-- 국어점수가 50점이거나 60점이거나 70점인 학생
select * from student where kor = 50 or kor = 60 or kor = 70;
select * from student where kor in (50, 60, 70);

-- 국어점수가 30~50 또는 90~100인 학생
select * from student
where kor >= 30 and kor <= 50 or kor >= 90 and kor <= 100;

-- 국어점수들 조회
select distinct kor from student;

-- 생일이 들어있지 않은 학생
select * from student where birth is null;
-- 생일이 있는 학생
select * from student where birth is not null;
-- 생일이 2000년 1월 1일인 학생
select * from student where birth = '2000-1-1';
-- 2000년 이후 출생자
select * from student where birth >= '2000-1-1';

-- 정렬
-- 번호의 역순으로
select * from student order by num desc;
-- 이름순서로
select * from student order by name;
-- 평균점수 순서로 모든 학생의 이름과 평균점수 출력
select name, (kor + eng + mat) / 3 average
from student
order by (kor + eng + mat) / 3 desc;

-- 평균점수가 80을 넘는 학생들의 이름과 평균점수를 성적순으로 출력
select name, round((kor + eng + mat) / 3, 1) average
from student
where (kor + eng + mat) / 3 > 80
order by average desc;

-- 국어 점수 상위 3명
select * from student order by kor desc limit 3;

-- 모든학생의 정보를 국어점수 순서로. 국어점수가 같으면 영어점수. 그것도 같으면 수학기준.
select * from student order by kor desc, eng desc, mat desc;

-- 주소가 부산시인 학생
select * from student where address like '부산시%';
-- 이름이 수로 끝나는 학생
select * from student where name like '%수';
-- 이름에 길이 들어가는 학생
select * from student where name like '%길%';
-- 이름이 김으로 시작하고 뒤에 2글자가 옴
select * from student where name like '김__';


-- 문자열 함수
select name, concat(name, '씨'), length(name) from student;
select address, substring(address, 2, 5) from student;

-- 주소에 '111'이 포함된 위치
select address, position('111' in address) from student;
-- 전화번호를 마지막 2자리를 **로 표시 (010-1234-56**)
select phone, concat(substring(phone, 1, 11), '**') from student;
-- 주소의 마지막 3글자를 ***로 표시
select address, concat(left(address, char_length(address) - 3), '***') from student;

-- 날짜 함수
-- 현재 시간정보
select now(), now(1), now(2), CURRENT_TIMESTAMP(), CURRENT_DATE();
-- 생일 30일 후
select birth, date_add(birth, interval 30 day) from student;
-- 생일 7일 전
select birth, date_sub(birth, interval 7 day) from student;

-- 기간 계산
-- 날짜 차이만 계산
select birth, datediff(now(), birth) from student;
-- 단위 지정 가능
select timestampdiff(day, birth, now()) from student;
select timestampdiff(month, birth, now()) from student;
select timestampdiff(year, birth, now()) from student;
-- 요일
select birth, dayname(birth), dayofweek(birth) from student;
-- 년월일 등 일부 정보만
select birth, year(birth), month(birth), day(birth) from student;
-- 생일 정보가 없는 사람들 제외하고 생일 순으로 출력
select name, concat(month(birth), '월', day(birth), '일') birth 
from student
where birth is not null 
order by month(birth), day(birth);

-- 날짜를 문자열로 변환
select birth, date_format(birth, '%y-%m-%d') from student;
select birth, date_format(birth, '%Y년 %m월 %d일') from student;
select date_format(now(), '%H시 %i분');

-- 문자열을 날짜로 변환
select str_to_date('250510', '%y%m%d');
select str_to_date('2025.05.10', '%Y.%m.%d');
select str_to_date('2025년 05월 10일', '%Y년 %m월 %d일');

insert into student(name, birth) values ('이OO', str_to_date('2025.05.10', '%Y.%m.%d'));

-- 그룹합수. 집계함수
select sum(kor) from student;
select avg(kor) from student;
select max(kor) from student;
select min(kor) from student;
select count(phone) from student;
select count(*) from student;

-- 국어 점수가 50점 미만인 학생은 몇명인가?
select count(*) from student where kor < 50;
-- 생일이 5월인 학생들의 영어점수 평균은?
select avg(eng) from student where month(birth) = 5;
-- 각 학생들의 평균점수
select name, (kor + eng + mat) / 3 from student;
-- 학생들의 전체 평균
select avg((kor + eng + mat) / 3) from student;
-- 학생들의 국어점수 평균
select avg(kor) from student;
-- 국어점수가 50점 이상인 학생
select name, kor from student where kor >= 50;
-- 국어점수가 전체국어점수평균 이상인 학생
select name, kor from student where kor >= (select avg(kor) from student);
-- select name, kor from student where kor >= (select kor from student);
-- 각 월별 생일인 학생들의 영어점수 평균
select month(birth), avg(eng) from student group by month(birth);
-- 생일정보가 있는 학생을 대상으로 월별 영어점수 평균. 
-- 단 평균이 50점 이하인 월은 제외하고 월 순서대로 출력한다.
select
	month(birth) month
	, avg(eng) avg
from 
	student
where
	birth is not null
group by
	month(birth)
having
	avg > 50
order by
	month;



