

-- 1. 테이블 생성
CREATE TABLE book (
    book_id     INT AUTO_INCREMENT PRIMARY KEY,
    title        VARCHAR(100) NOT NULL,
    author       VARCHAR(50) NOT NULL,
    publisher    VARCHAR(50),
    published_year INT,
    price        INT DEFAULT 0 CHECK (price >= 0)
);

create table sale (
    sale_id INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT,
    branch VARCHAR(30),
    quantity INT DEFAULT 1 CHECK (quantity >= 1) ,
    sale_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (book_id) REFERENCES book(book_id)
);

 -- 테이블 목록 보기
 show tables;

-- 데이터 삽입
INSERT INTO book (title, author, publisher, published_year, price) VALUES
('SQL 입문', '김철수', '한빛미디어', 2021, 28000),
('데이터베이스 설계', '홍길동', '길벗', 2022, 32000),
('파이썬 프로그래밍', '이영희', '한빛미디어', 2020, 25000),
('자바 마스터', '최지훈', '에이콘출판사', 2023, 37000),
('웹 개발 기초', '박지민', '길벗', 2021, 27000),
('리눅스 운영체제', '김민재', '정보문화사', 2022, 30000),
('알고리즘 트레이닝', '서현우', '위키북스', 2024, 33000),
('데이터 분석 실무', '조민수', '이지스퍼블리싱', 2023, 31000),
('머신러닝 입문', '정유진', '길벗', 2022, 35000),
('SQL 실전 노트', '홍길동', '한빛미디어', 2024, 29000),
('HTML/CSS 가이드', '박서준', '이지스퍼블리싱', 2021, 24000),
('Node.js 기초', '장민호', '에이콘출판사', 2020, 26000),
('AI 개론', '한지은', '길벗', 2023, 34000),
('네트워크 개념', '이수진', '정보문화사', 2021, 22000),
('운영체제 이론', '김다연', '위키북스', 2022, 23000),
('React 활용', '조수연', '길벗', 2024, 36000),
('데이터베이스 입문', '홍길동', '정보문화사', 2021, 28000),
('C언어 입문서', '최예린', '한빛미디어', 2019, 21000),
('SQL과 데이터', '윤지호', '이지스퍼블리싱', 2023, 27000),
('자바스크립트 완전정복', '이재형', '에이콘출판사', 2024, 39000);


INSERT INTO sale (book_id, branch, quantity, sale_date) VALUES
(1, '서울점', 3, '2025-03-15 10:00:00'),
(2, '부산점', 2, '2025-04-10 14:30:00'),
(3, '대전점', 1, '2025-04-01 09:00:00'),
(4, '서울점', 5, '2025-05-01 13:20:00'),
(5, '광주점', 2, '2025-03-20 16:00:00'),
(6, '서울점', 4, '2025-04-05 11:45:00'),
(7, '대구점', 1, '2025-03-18 12:10:00'),
(8, '부산점', 2, '2025-05-02 15:00:00'),
(9, '서울점', 3, '2025-04-08 17:00:00'),
(10, '대전점', 1, '2025-03-25 10:20:00'),
(11, '광주점', 2, '2024-12-30 14:10:00'),
(12, '대전점', 1, '2024-04-01 13:00:00'),
(13, '서울점', 5, '2025-03-05 09:30:00'),
(14, '서울점', 2, '2025-01-15 11:00:00'),
(15, '부산점', 3, '2024-08-22 14:45:00'),
(16, '광주점', 2, '2024-10-10 16:20:00'),
(17, '대구점', 1, '2025-02-02 10:10:00'),
(18, '서울점', 4, '2025-04-12 14:00:00'),
(19, '대전점', 2, '2025-04-25 13:40:00'),
(20, '서울점', 3, '2025-04-30 15:30:00');


--데이터 확인
select * from book;
select * from sale;



-- 1. 위의 조건으로 book 테이블을 생성하는 SQL문을 작성한다.

-- 2. 위의 조건으로 sale 테이블을 생성하는 SQL문을 작성한다.

-- 3. 가격이 30,000원 이상인 도서의 제목과 가격을 조회한다.
select title , price from book where price >= 30000;
-- 4. 2021년부터 2023년 사이에 출판된 도서의 제목과 출판 연도를 조회한다.
select title, published_year from book where published_year between 2021 and 2023;
-- 5. 제목에 'sql'이라는 단어가 포함된 도서정보를 조회한다.
select * from book where title like '%sql%';
-- 6. 제목 글자 수가 10자 이상인 도서의 제목과 글자 수를 조회한다.
select title, char_length(title) as title_length from book where char_length(title) >= 10;
-- 7. 모든 도서의 제목을 대문자로 출력한다.
select title, upper(title) as title_upper from book;
-- 8. 전체 평균 가격보다 높은 도서의 제목과 가격을 조회한다.
select title, price from book where price > (select avg(price) from book);

-- 8-1 도서의 평균 가격을 조회한다. //29350
select avg(price) from book;

-- 9. 출판사 이름을 기준으로 오름차순, 출판사 이름이 같다면 가격을 기준으로 내림차순 정렬하여 모든 도서를 조회한다.
select * from book order by publisher asc, price desc;
-- 10. '서울점'에서 이루어진 2025년 판매 내역을 조회한다.
select * from sale where branch = '서울점' and sale_date like '2025%';
-- 11. 3월에 판매된 도서들의 판매 지점별 수량합계를 조회한다.
select branch, sum(quantity) as total_quantity from sale where sale_date like '2025-03%' group by branch;
-- 12. 판매량이 가장 많은 지점을 조회한다. (수량 기준)
select branch, sum(quantity) as total_quantity from sale group by branch order by total_quantity desc limit 1;

-- 12-1 모든 지점의 판매량을 조회한다.
select branch, sum(quantity) as total_quantity from sale group by branch;

-- 13. 2024년 4월 이후의 판매 내역을 판매일시 기준으로 오름차순으로 조회한다.
select * from sale where sale_date >= '2024-04-01' order by sale_date asc;

-- 14. 판매 내역을 다음과 같이 열이름을 지정하여 날짜순으로 출력한다. 금액은 가격x수량으로 계산한다.
-- 판매 날자(y'년' - m'월' - d'일') | 도서 제목 | 지점명 | 수량 | 금액
select  DATE_FORMAT(sale.sale_date, '%Y년  %m월  %d일') AS 판매날짜, book.title AS 도서제목, sale.branch AS 지점명 AS 수량, (book.price * sale.quantity) as 금액
from sale
join book on sale.book_id = book.book_id
order by sale.sale_date asc;  
title, branch, quantity, (book.price * sale.quantity) as total_price from sale;
-- 15. 도서별(도서번호기준) 총 판매 수량과 총 판매 금액을 조회한다.
select book.book_id, book.title, sum(sale.quantity) as 판매수량, sum(book.price * sale.quantity) as 판매금액
from sale
join book on sale.book_id = book.book_id
group by book.book_id, book.title;

-- 16. 제목이 '데이터베이스 입문', 저자가 '홍길동’인 도서의 가격을 35,000원으로 수정한다.
update book set price = 35000 where title = '데이터베이스 입문' and author = '홍길동';

-- 17. '대전점'에서 이루어진 모든 판매 기록을 삭제한다
DELETE FROM sale WHERE branch = '대전점';