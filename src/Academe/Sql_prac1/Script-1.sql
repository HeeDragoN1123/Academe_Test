
-- 1. 테이블 생성
CREATE TABLE student (
    num         INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(30) NOT NULL,
    phone       VARCHAR(20),
    adress      VARCHAR(200),
    kor         TINYINT DEFAULT 0 CHECK (kor BETWEEN 0 AND 100),
    eng         TINYINT DEFAULT 0 CHECK (eng BETWEEN 0 AND 100),
    mat         TINYINT DEFAULT 0 CHECK (mat BETWEEN 0 AND 100),
    birth       DATE,
    createdate  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 2. 데이터 삽입 (김영희)
INSERT INTO student (name, phone, adress, kor, eng, mat, birth)
VALUES
('김민수', '010-7777-8888', '서울특별시 강서구 화곡동 678-90', 85, 90, 88, '1999-02-05'),
('정지훈', '010-8888-9999', '부산광역시 수영구 광안동 123-45', 78, 82, 85, '2000-03-10'),
('한지민', '010-1111-3333', '경기도 고양시 일산동구 백석동 456-78', 92, 85, 91, '1998-06-15'),
('박지수', '010-4444-6666', '대전광역시 서구 갈마동 789-01', 60, 55, 65, '2001-08-22'),
('장승연', '010-5555-7777', '전라북도 전주시 덕진동 234-56', 99, 94, 97, '1997-01-30'),
('송아영', '010-2222-4444', '인천광역시 연수구 송도동 567-89', 70, 65, 75, '2002-12-11'),
('오세훈', '010-3333-5555', '서울특별시 동대문구 장안동 678-90', 88, 72, 78, '1999-09-07'),
('김수영', '010-6666-8888', '경상북도 포항시 남구 포스코대로 123', 95, 89, 93, '2000-04-03'),
('이종민', '010-7777-9999', '충청남도 천안시 서북구 쌍용동 123-45', 80, 85, 88, '2001-10-25'),
('최지훈', '010-8888-7777', '울산광역시 남구 신정동 234-56', 65, 60, 50, '2002-07-14');



-- (아래는 예시, 선택 실행)

-- 이름이 '김철수'인 학생 삭제
-- DELETE FROM student WHERE name = '김철수';

-- 전체 삭제
DELETE FROM student;
TRUNCATE TABLE student;
DROP TABLE student;

-- 조건 조회 예시
-- 번호가 3번 이상인 학생
SELECT * FROM student WHERE num >= 3;

-- 국어점수가 70점 이상인 학생의 번호와 이름
SELECT num, name FROM student WHERE kor >= 70;

-- 국어점수와 영어점수가 모두 70점 이상인 학생의 번호와 이름
SELECT num, name FROM student WHERE kor >= 70 AND eng >= 70;

-- 40점 미만 과락이 하나라도 있는 학생
SELECT * FROM student WHERE kor <= 40 OR eng <= 40 OR mat <= 40;

-- 생일이 들어있지 않은 학생
seclect * from student where birth is null
-- 생일이 2000 년 1우러 1일인 학생
select * from syudent where birth ='2000-1-1'
-- 2000년 이후 출생자
select * from student where birth ='2000-1-1'

-- 국어 점수들 조회
select distinct kor from student;




-- 정렬
-- 번호의 역순
select *from student order by num desc;

-- 이름 순서로
select *from student order by name;

-- 평균점수 순서로 모든 학생의 이름과 평균점수 출력
select name, (kor + eng + mat) /3 average
from student
order by (kor + eng + mat) / 3 desc;



-- 평균점수가 80점 이상인 학생들의 이름과 평균점수를 내림차순으로 정렬
select name, (kor + eng + mat) / 3 average
from student
where (kor + eng + mat) / 3 > 80
order by average desc;

-- 국어점수를 기준으로 상위 3명 정렬
select * from student 
order by kor desc limit 3;


-- 모든 학생의 정보를 국어점수 순서로, 국어점수가 같으면 영어점수, 그것도 같으면 수학점수 순으로 정렬
select * from student order by kor, eng , mat;

-- 주소가 부산시인 학생
select * from student where adress like '부산%';

-- 서울이 포함된 주소 모두다 검색
select * from student where adress like '%서울%'

-- 서울이 아닌  주소 모두다 검색
select * from student where adress not like '%서울%'

-- 이름에 김으로 시작하고 뒤에 2글자가 옴
select * from student where name like '김__'

-- 문자열 함수
select name, concat(name, '씨'), length(name) from student;
select address, substring(adress, 2, 5)

-- 주소에 111 이 포함됨 위치
select adress, position('111' in adress) from student; 


-- 전화번호를 마지막 2자리를 **으로 표시 (010-1234-5678)
select phone, concat(LEFT(phone, LENGTH(phone) - 2), '**') FROM student;

-- 주소 마지막3글자를 ***
select adress, concat(LEFT(adress, CHAR_LENGTH(adress) - 3), '***') FROM student; 
select adress, concat(SUBSTRING(adress,1, CHAR_LENGTH(adress)-3), '***') FROM student; 

-- 중간 네자리 가리기
SELECT 
  phone,
  CONCAT(
    LEFT(phone, 4),       -- '010-'
    '****',               -- 중간 네 자리 가림
    RIGHT(phone, 5)       -- '-8888'
  ) AS masked_phone
FROM student;

-- 날짜 함수
-- 현재 시간 정보
select CURRENT_DATE(), CURRENT_TIME(), CURRENT_TIMESTAMP(), NOW();


-- DATE add
select NOW(), DATE_ADD(NOW(), INTERVAL -1 YEAR );


-- 날짜로 요일 반환
select DAYNAME('2025-05-08');

-- 생일 30일 후
select birth, DATE_ADD(birth, INTERVAL 30 day) from student;

-- 생일 7일 전
select birth, DATE_SUB(birth, INTERVAL 30 day) from student;

-- 기간 계산
select birth, DATEDIFF(NOW(), birth) from student;

-- 단위 지정 가능
select birth, timestampdiff(day, birth, NOW()) from student;
select birth, timestampdiff(month, birth, NOW()) from student;
select birth, timestampdiff(year, birth, NOW()) from student;


-- 요일
select birth, DAYNAME(birth), DAYOFWEEK(birth) from student;


-- 일부 정보만
select birth, year(birth),MONTH(birth),DAY(birth ) from student;

-- 생일정보가 없는 사람들 제외하고 생일순으로 
select name, concat(MONTH(birth), '월', DAY(birth), '일') birth FROM student
where birth is not null ORDER by MONTH(birth ), DAY(birth );

-- 날짜를 문자열로 변환
select birth, date_format(birth, '%y-%m-%d') from student;
select birth, date_format(birth, '%y년-%m월-%d일') from student;


-- 문자열을 날짜로 변환
select str_to_date('250508', '%y%m%d');

insert into student(name, birth) value('이00', '2025.05.10');
insert into student(name, birth) value('이00', str_to_date('2025.05.10', '%Y.%m.%d'));


-- sum

SELECT SUM(kor) from student;

-- count

select count(phone) from student;

select COUNT(*) from student;


-- 국어점수가 50 점 미만인 학생은 몇명인가?
select count(*) from WHERE  kor <50;
-- 생일이 5월인 학생들의 영어점수 평균은?
select avg(eng) from student where month(birth) = 5;
-- 학생들의 전체 평균 라운드 함수 안에서 쓰면 소수점 자리수조절 가능
select name, ROUND((kor + eng + mat) /3 ,1) average
from student;
-- 학생들의 국어점수 평균
select avg(kor) from student;
-- 국어점수가 50 점 이상인 학생
select name, kor from student where kor >= 50;

-- 국어점수가 전체국어ㅓ점수 평균 이상인 학생
select name, kor from student where kor >= (select avg(kor) from student);

-- 각 월별 생일인 핵생들의 영어점수 평균
select month(birth), avg(eng) from student GROUP by month(birth);
-- 생일정보가 있는 학생을 대상으로 월별 영어점수 평균, 단 평균이 50 점 이하인 월은 제외하고 월 순서대로 출력한다

SELECT
	MONTH(birth) month
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
;



-- 전체 검색
SELECT * FROM student;


