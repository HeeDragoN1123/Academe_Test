CREATE TABLE member (
	id varchar(30) NOT NULL,
	password varchar(100) NULL,
	name varchar(30) NULL,
	field varchar(30) NULL,
	usertype varchar(30) NULL,
	isactive tinyint NULL,
	PRIMARY KEY (id)
);

CREATE TABLE board (
	boardnum integer NOT NULL,
	id varchar(30) NOT NULL,
	title varchar(1000) NULL,
	contents mediumtext NULL,
	viewcount integer NULL,
	PRIMARY KEY (boardnum),
	FOREIGN KEY (id) REFERENCES member (id)
);

CREATE TABLE replay (
	replaynum integer NOT NULL,
	id varchar(30) NOT NULL,
	boardnum integer NOT NULL,
	replaytext varchar(2000) NULL,
	PRIMARY KEY (replaynum, id, boardnum),
	FOREIGN KEY (id) REFERENCES member (id),
	FOREIGN KEY (boardnum) REFERENCES board (boardnum)
);


INSERT INTO member (id, password, name, field, usertype, isactive) VALUES
('user1', 'pass1', '홍길동', '개발', 'admin', 1),
('user2', 'pass2', '김철수', '디자인', 'user', 1),
('user3', 'pass3', '이영희', '마케팅', 'user', 1),
('user4', 'pass4', '박지성', '개발', 'user', 0),
('user5', 'pass5', '최강희', '기획', 'admin', 1);



INSERT INTO board (boardnum, id, title, contents, viewcount) VALUES
(1, 'user1', '안녕하세요', '첫 번째 게시글입니다.', 12),
(2, 'user1', '개발 팁 공유', '자바에서 try-catch 잘 쓰는 법.', 30),
(3, 'user2', '디자인 도구 추천', '피그마 vs XD 비교글입니다.', 18),
(4, 'user2', 'UI/UX 트렌드', '2025년 UI/UX 흐름 정리.', 25),
(5, 'user3', '마케팅 전략', 'SNS 마케팅의 핵심은?', 10),
(6, 'user3', '콘텐츠 기획법', '사람을 끌어들이는 콘텐츠?', 7),
(7, 'user4', '개발자 성장일기', '오늘은 깃을 공부했다.', 4),
(8, 'user4', '오류 해결 모음', 'NullPointerException 정리.', 6),
(9, 'user5', '기획자의 시선', '프로젝트 시작 전 점검사항.', 9),
(10, 'user5', '아이디어 발상법', '브레인스토밍 잘하는 팁.', 11);

INSERT INTO board (boardnum, id, title, contents, viewcount) VALUES
(11, 'user1', '개발 전략 정리', '효율적인 개발을 위한 전략을 소개합니다.', 45),
(12, 'user2', '디자인의 본질', '디자인이란 무엇인가에 대한 고찰.', 32),
(13, 'user3', '마케팅 통계 분석', '최근 캠페인의 통계를 분석해보자.', 22),
(14, 'user4', '깃허브 사용법', '버전 관리에 필수적인 깃허브 정리.', 28),
(15, 'user5', '기획의 시작', '기획 단계에서 고려해야 할 점들.', 19),
(16, 'user1', '5월 개발 회고', '이번 달의 개발 진행 상황 정리.', 17),
(17, 'user2', 'UI/UX 베스트 사례', '잘 만든 UI/UX 사례 소개.', 38),
(18, 'user3', '마케팅 도구 모음', '유용한 마케팅 도구들을 소개합니다.', 25),
(19, 'user4', '개발자 도구 소개', '개발에 도움되는 도구 정리.', 33),
(20, 'user5', '기획서 샘플', '사용하기 좋은 기획서 템플릿 예시.', 21),
(21, 'user1', '코드 리뷰 팁', '좋은 코드 리뷰를 위한 가이드라인.', 29),
(22, 'user2', '디자인 피드백 방법', '효율적인 피드백 방식 소개.', 31),
(23, 'user3', '마케팅 실패 사례', '주의해야 할 실패 사례 분석.', 14),
(24, 'user4', '코딩 테스트 문제 풀이', '자주 나오는 코딩 문제 풀이 모음.', 40),
(25, 'user5', '아이디어 발상법', '창의적인 아이디어를 떠올리는 방법.', 18),
(26, 'user1', '개발자의 하루 루틴', '개발자가 하루를 보내는 방법.', 16),
(27, 'user2', '디자인 흐름 이해', '디자인을 논리적으로 접근하기.', 20),
(28, 'user3', '마케팅 Funnel 개념', 'Funnel 단계별 전략 정리.', 26),
(29, 'user4', '오류 로그 보는 법', '오류 로그를 해석하는 방법.', 30),
(30, 'user5', '프로젝트 관리법', '효율적인 프로젝트 관리를 위한 팁.', 23),
(31, 'user1', 'REST API 개념', 'RESTful API에 대한 소개.', 42),
(32, 'user2', '디자인 트렌드 2025', '올해의 디자인 트렌드 예측.', 34),
(33, 'user3', '콘텐츠 마케팅 전략', '콘텐츠로 고객을 끌어들이기.', 27),
(34, 'user4', '스프링 부트 입문', '스프링 부트 시작하기.', 37),
(35, 'user5', '회의 잘하는 법', '효율적인 회의를 위한 기술.', 24),
(36, 'user1', '배포 자동화', 'CI/CD 파이프라인 구성 방법.', 39),
(37, 'user2', '프로토타입 제작', '빠르게 시제품을 만드는 팁.', 22),
(38, 'user3', '브랜드 전략 세우기', '브랜드를 어떻게 설계할 것인가.', 30),
(39, 'user4', '디버깅 사례 모음', '자주 발생하는 버그와 해결책.', 41),
(40, 'user5', '마감관리 노하우', '프로젝트 마감을 잘 지키는 법.', 36);




INSERT INTO replay (replaynum, id, boardnum, replaytext, field, field2) VALUES
(1, 'user2', 1, '좋은 글 감사합니다!', NULL, NULL),
(2, 'user3', 1, '배우고 갑니다.', NULL, NULL),
(3, 'user4', 2, 'try-catch 예시 더 주세요.', NULL, NULL),
(4, 'user5', 2, '유용하네요!', NULL, NULL),
(5, 'user1', 3, '저도 피그마 좋아해요.', NULL, NULL),
(6, 'user3', 3, '디자인 잘 몰라서 참고됩니다.', NULL, NULL),
(7, 'user1', 4, '좋은 정보 고맙습니다.', NULL, NULL),
(8, 'user5', 4, '요즘 트렌드 잘 정리하셨네요.', NULL, NULL),
(9, 'user2', 5, '전략 참고할게요!', NULL, NULL),
(10, 'user4', 5, '마케팅도 재밌네요.', NULL, NULL),
(11, 'user1', 6, '콘텐츠 기획 힘든데 도움됐어요.', NULL, NULL),
(12, 'user5', 6, '정말 공감돼요.', NULL, NULL),
(13, 'user2', 7, '응원합니다!', NULL, NULL),
(14, 'user3', 7, '저도 비슷한 경험이 있어요.', NULL, NULL),
(15, 'user1', 8, '오류 해결법 잘 정리되었네요.', NULL, NULL),
(16, 'user2', 8, '공감합니다.', NULL, NULL),
(17, 'user3', 9, '기획자 시점 신선해요.', NULL, NULL),
(18, 'user4', 9, '잘 읽었습니다.', NULL, NULL),
(19, 'user1', 10, '브레인스토밍 꿀팁이네요.', NULL, NULL),
(20, 'user2', 10, '저도 써봐야겠어요.', NULL, NULL);


-- 아이디가 'user2'인 회원의 이름을 관리자로 권한을 admin으로 변경

update member set name='관리자', usertype='admin' where id='user2';

-- 'user3'가 작성한 글
SELECT * FROM	board
WHERE id = 'user3';
-- 제목에 전략이 포함된 글
SELECT * FROM board
WHERE title LIKE '%전략%';
-- 제목 또는 내용에 전략이 포함된 글
-- 최근 7일 이내에 올라온 글을 조회수가 높은 순으로 
-- 관리자가 작성한 글 중에 최근글 3개
-- 사용자 'user1' , 'user2' , 'user3' 3사람이 작성한 글
-- 1번글에 달린 리플을 최신순으로
-- user1 이 올해 5월에 작성한 글의 개수
-- user1 가작성한 글의 평균 조회수
-- 각 사용자별 개시글 수
-- 각 개시글에 달린 리플수




DROP TABLE replay;

select * from member;
select * from board;
select * from replay;



