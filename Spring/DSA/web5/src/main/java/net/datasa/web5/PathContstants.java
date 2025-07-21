package net.datasa.web5;

public interface PathContstants {
// 최상위 경로
    //  public static final
    String BASE = "/";
    // 회원정보 관련 령고
    String MEMBER = BASE + "member";

    String MEMBER_SIGNUP = MEMBER + "/signup";

    String MEMBER_IDCHECK = MEMBER + "/idcheck";

    String MEMBER_JOIN = MEMBER + "/join";

    String MEMBER_LOGIN = MEMBER + "/login";

    String MEMBER_INFO = MEMBER + "/info";

    String BOARD = BASE + "board";

    String BOARD_WRITE = BOARD + "/write";

}
