$(function() {
    // 폼 제출 이벤트 핸들러 등록
    $('#signupForm').on('submit', function(e) {
        // 1. 아이디 검사 (필수)
        if (!$('#memberId').val().trim()) {
            alert('아이디를 입력하세요.');
            $('#memberId').focus();
            return false; // 폼 제출 중단
        }
        // 2. 비밀번호 검사 (필수, 6자 이상)
        var pw = $('#memberPassword').val();
        if (!pw) {
            alert('비밀번호를 입력하세요.');
            $('#memberPassword').focus();
            return false;
        }
        if (pw.length < 6) {
            alert('비밀번호는 6자 이상이어야 합니다.');
            $('#memberPassword').focus();
            return false;
        }
        // 3. 이름 검사 (필수)
        if (!$('#memberName').val().trim()) {
            alert('이름을 입력하세요.');
            $('#memberName').focus();
            return false;
        }
        // 4. 이메일 검사 (입력값이 있을 때만 검사)
        var email = $('#email').val();
        if (email) {
            // 이메일 정규식: 영문/숫자/특수문자 + @ + 도메인 + . + 최상위도메인(2자이상)
            var emailReg = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
            if (!emailReg.test(email)) {
                alert('올바른 이메일 형식을 입력하세요.');
                $('#email').focus();
                return false;
            }
        }
        // 5. 전화번호 검사 (입력값이 있을 때만 검사)
        var phone = $('#phone').val();
        if (phone) {
            // 전화번호 정규식: 01X-XXX(X)-XXXX
            var phoneReg = /^01[0-9]-\d{3,4}-\d{4}$/;
            if (!phoneReg.test(phone)) {
                alert('올바른 전화번호 형식을 입력하세요. (예: 010-1234-5678)');
                $('#phone').focus();
                return false;
            }
        }
        // 6. 주소는 선택 입력이므로
