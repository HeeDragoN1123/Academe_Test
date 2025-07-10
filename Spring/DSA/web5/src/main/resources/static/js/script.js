// 아이디 중복검사 결과 저장 변수
var idCheckPassed = false;

$(function() {
    // 중복검사 버튼 클릭 이벤트
    $("#checkIdBtn").click(function() {
        var memberId = $("#memberId").val().trim();
        if(!memberId) {
            $("#idCheckMsg").text("아이디를 입력하세요.").css("color", "red");
            idCheckPassed = false;
            return;
        }
        $.ajax({
            url: "/member/join",
            type: "GET",
            data: { memberId: memberId },
            success: function(isDuplicate) {
                if(isDuplicate === true || isDuplicate === "true") {
                    $("#idCheckMsg").text("중복된 ID입니다.").css("color", "red");
                    idCheckPassed = false;
                } else {
                    $("#idCheckMsg").text("사용 가능한 ID입니다.").css("color", "green");
                    idCheckPassed = true;
                }
            },
            error: function() {
                $("#idCheckMsg").text("중복 확인 중 오류가 발생했습니다.").css("color", "red");
                idCheckPassed = false;
            }
        });
    });

    // 아이디 값이 변경될 때마다 중복검사 다시 하라고 유도
    $("#memberId").on('input', function() {
        idCheckPassed = false;
        $("#idCheckMsg").text("중복검사를 해주세요.").css("color", "gray");
    });

    // 폼 제출 이벤트
    $('#signupForm').on('submit', function(e) {
        // 1. 아이디 검사 (필수)
        if (!$('#memberId').val().trim()) {
            alert('아이디를 입력하세요.');
            $('#memberId').focus();
            return false;
        }
        // **아이디 중복검사 통과 여부 확인**
        if(!idCheckPassed) {
            alert('아이디 중복검사를 해주세요.');
            $('#memberId').focus();
            return false;
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
            var phoneReg = /^01[0-9]-\d{3,4}-\d{4}$/;
            if (!phoneReg.test(phone)) {
                alert('올바른 전화번호 형식을 입력하세요. (예: 010-1234-5678)');
                $('#phone').focus();
                return false;
            }
        }
        // 6. 주소는 선택 입력이므로 추가 검사 없음

        // 통과시 제출
        return true;
    });
});
