-- 회원 테이블
CREATE TABLE member (
	id VARCHAR(30) NOT NULL PRIMARY KEY,  -- PK 명확하게 지정
	password VARCHAR(100),
	name VARCHAR(30),
	field VARCHAR(30),
	usertype VARCHAR(30) DEFAULT 'user' 
		CHECK (usertype IN ('admin', 'user', 'guest')),
	isactive TINYINT DEFAULT 1 
		CHECK (isactive IN (0, 1))
);

-- 게시판 테이블
CREATE TABLE board (
	boardnum INTEGER NOT NULL PRIMARY KEY,
	id VARCHAR(30) NOT NULL,
	title VARCHAR(1000),
	contents MEDIUMTEXT,
	viewcount INTEGER,
	created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	FOREIGN KEY (id) REFERENCES member(id)
);

-- 댓글 테이블
CREATE TABLE replay (
	replaynum INTEGER NOT NULL,
	id VARCHAR(30) NOT NULL,
	boardnum INTEGER NOT NULL,
	replaytext VARCHAR(2000),
	PRIMARY KEY (replaynum, id, boardnum),
	FOREIGN KEY (id) REFERENCES member(id),
	FOREIGN KEY (boardnum) REFERENCES board(boardnum)
);




INSERT INTO member (id, password, name, field, usertype, isactive) VALUES
('user1', 'pass1', '홍길동', '개발', 'admin', 1),
('user2', 'pass2', '김철수', '디자인', 'user', 1),
('user3', 'pass3', '이영희', '마케팅', 'user', 1),
('user4', 'pass4', '박지성', '개발', 'user', 0),
('user5', 'pass5', '최강희', '기획', 'admin', 1);


INSERT INTO board (boardnum, id, title, contents, viewcount, created_at, updated_at) VALUES
(1, 'user1', '안녕하세요', '첫 번째 게시글입니다.', 12, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(2, 'user1', '개발 팁 공유', '자바에서 try-catch 잘 쓰는 법.', 30, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(3, 'user2', '디자인 도구 추천', '피그마 vs XD 비교글입니다.', 18, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(4, 'user2', 'UI/UX 트렌드', '2025년 UI/UX 흐름 정리.', 25, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(5, 'user3', '마케팅 전략', 'SNS 마케팅의 핵심은?', 10, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(6, 'user3', '콘텐츠 기획법', '사람을 끌어들이는 콘텐츠?', 7, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(7, 'user4', '개발자 성장일기', '오늘은 깃을 공부했다.', 4, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(8, 'user4', '오류 해결 모음', 'NullPointerException 정리.', 6, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(9, 'user5', '기획자의 시선', '프로젝트 시작 전 점검사항.', 9, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(10, 'user5', '아이디어 발상법', '브레인스토밍 잘하는 팁.', 11, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(11, 'user1', '개발 전략 정리', '효율적인 개발을 위한 전략을 소개합니다.', 45, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(12, 'user2', '디자인의 본질', '디자인이란 무엇인가에 대한 고찰.', 32, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(13, 'user3', '마케팅 통계 분석', '최근 캠페인의 통계를 분석해보자.', 22, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(14, 'user4', '깃허브 사용법', '버전 관리에 필수적인 깃허브 정리.', 28, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(15, 'user5', '기획의 시작', '기획 단계에서 고려해야 할 점들.', 19, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(16, 'user1', '5월 개발 회고', '이번 달의 개발 진행 상황 정리.', 17, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(17, 'user2', 'UI/UX 베스트 사례', '잘 만든 UI/UX 사례 소개.', 38, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(18, 'user3', '마케팅 도구 모음', '유용한 마케팅 도구들을 소개합니다.', 25, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(19, 'user4', '개발자 도구 소개', '개발에 도움되는 도구 정리.', 33, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(20, 'user5', '기획서 샘플', '사용하기 좋은 기획서 템플릿 예시.', 21, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(21, 'user1', '코드 리뷰 팁', '좋은 코드 리뷰를 위한 가이드라인.', 29, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(22, 'user2', '디자인 피드백 방법', '효율적인 피드백 방식 소개.', 31, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(23, 'user3', '마케팅 실패 사례', '주의해야 할 실패 사례 분석.', 14, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(24, 'user4', '코딩 테스트 문제 풀이', '자주 나오는 코딩 문제 풀이 모음.', 40, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


INSERT INTO board (boardnum, id, title, contents, viewcount, created_at, updated_at) VALUES
(25, 'user5', '기획서 작성법', '효과적인 기획서 작성 방법.', 20, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(26, 'user1', '디자인 트렌드', '2025년 디자인 트렌드 예측.', 15, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(27, 'user2', '마케팅 캠페인 사례', '성공적인 캠페인 사례 분석.', 12, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(28, 'user3', '개발자 커리어', '개발자로서의 커리어 관리 방법.', 10, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(29, 'user4', 'UI/UX 디자인 원칙', '디자인의 기본 원칙 정리.', 8, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(30, 'user5', '마케팅 전략 수립법', '효과적인 마케팅 전략 수립 방법.', 6, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO replay (replaynum, id, boardnum, replaytext) VALUES
(1, 'user2', 1, '안녕하세요! 반갑습니다.'),
(2, 'user3', 1, '첫 글 축하드립니다!'),
(3, 'user1', 2, '좋은 팁 감사합니다!'),
(4, 'user4', 2, '유용한 정보네요.'),
(5, 'user5', 3, '디자인 도구에 대한 좋은 비교입니다.'),
(6, 'user1', 4, 'UI/UX 트렌드에 대해 더 알고 싶어요.'),
(7, 'user2', 5, '마케팅 전략에 대한 좋은 글입니다.'),
(8, 'user3', 6, '콘텐츠 기획법에 대해 더 알고 싶어요.'),
(9, 'user4', 7, '개발자 성장일기 잘 읽었습니다.'),
(10, 'user5', 8, '오류 해결 모음 유용하네요.'),
(11, 'user1', 9, '기획자의 시선에 공감합니다.'),
(12, 'user2', 10, '아이디어 발상법 좋은 팁입니다.'),
(13, 'user3', 11, '개발 전략 정리 잘 읽었습니다.'),
(14, 'user4', 12, '디자인의 본질에 대한 좋은 고찰입니다.'),
(15, 'user5', 13, '마케팅 통계 분석 유용하네요.'),
(16, 'user1', 14, '깃허브 사용법 잘 정리되었습니다.'),
(17, 'user2', 15, '기획의 시작에 대한 좋은 글입니다.'),
(18, 'user3', 16, '5월 개발 회고 잘 읽었습니다.'),
(19, 'user4', 17, 'UI/UX 베스트 사례에 대해 더 알고 싶어요.'),
(20, 'user5', 18, '마케팅 도구 모음 유용하네요.'),
(21, 'user1', 19, '개발자 도구 소개 잘 읽었습니다.'),
(22, 'user2', 20, '기획서 샘플 유용하네요.'),
(23, 'user3', 21, '코드 리뷰 팁 잘 읽었습니다.'),
(24, 'user4', 22, '디자인 피드백 방법에 대해 더 알고 싶어요.'),
(25, 'user5', 23, '마케팅 실패 사례 분석 유용하네요.'),
(26, 'user1', 24, '코딩 테스트 문제 풀이 잘 읽었습니다.');
-- 아이디가 'user2'인 회원의 이름을 관리자로 권한을 admin으로 변경

update member set name='관리자', usertype='admin' where id='user2';

-- 'user3'가 작성한 글
SELECT * FROM	board
WHERE id = 'user3';
-- 제목에 전략이 포함된 글
SELECT * FROM board
WHERE title LIKE '%전략%';
-- 제목 또는 내용에 전략이 포함된 글
SELECT * FROM board
WHERE title LIKE '%전략%' OR contents LIKE '%전략%';
-- 최근 7일 이내에 올라온 글을 조회수가 높은 순으로 
SELECT * FROM board
WHERE created_at >= DATE_SUB(NOW(), INTERVAL 7 DAY)
ORDER BY viewcount DESC;
-- 관리자가 작성한 글 중에 최근글 3개
SELECT * FROM board
WHERE id IN (
    SELECT id FROM member WHERE usertype = 'admin'
)
ORDER BY created_at DESC
LIMIT 3;

-- 1번글에 달린 리플을 최신순으로
SELECT * FROM replay
WHERE boardnum = 1
-- user1 이 올해 5월에 작성한 글의 개수
SELECT COUNT(*) FROM board
WHERE id = 'user1' AND MONTH(created_at) = 5 AND YEAR(created_at) = YEAR(NOW());
-- user1 가작성한 글의 평균 조회수
SELECT AVG(viewcount) FROM board
WHERE id = 'user1';

-- 각 사용자별 개시글 수
SELECT id, COUNT(*) from board group by id

-- 각 개시글에 달린 리플수

SELECT boardnum, COUNT(*) from replay group by boardnum

-- 서브쿼리
select 컬럼명 from 테이블명 where 조건;

-- 게시글의 번호와 제목, 작성자 이름 출력
SELECT boardnum, title,
       (SELECT name FROM member WHERE member.id = board.id) name
FROM board;

-- 관리자가 작성한 글 중에 최근글 3개
SELECT * FROM board
WHERE id IN (
		SELECT id FROM member WHERE usertype = 'admin'
)
ORDER BY created_at DESC
LIMIT 3;

-- 조인
select * from  member, board;

select * from  member, board WHERE member.id = board.id;

select * from  member join board on member.id = board.id;

-- left join
select * from  member left join board on member.id = board.id;
-- right join
select * from  member right join board on member.id = board.id;


-- 작성자 이름과 글 제품

select name, title from  member, board WHERE member.id = board.id;


-- 이름 , 제목,조회수를  조회수가 10 이상인 글만 출력
SELECT m.name, b.title, b.viewcount
FROM member m
JOIN board b ON m.id = b.id
WHERE b.viewcount >= 10;

-- id별  작성글 개수를 출력 (id , 이름 , 개수) 단, 글 수가 3이상인 회원만


-- 2025 년 작성 글 개수
SELECT COUNT(*) 
FROM board 
WHERE YEAR(created_at) = 2025;


-- 년도 별 글 개수
select year(created_at), count(*) from board group by year(created_at);

-- 테이블 삭제
DROP TABLE board;

select * from member;
select * from board;
select * from replay;



