package com.ssp.subdemo.common.constant;

public enum AuthResultEnum {

    BQSuccess("BQ000000", 0),
    BWSuccess("BW000000", 0),
    U1Success("00000000", 0),
    WLSuccess("00000000", 0),
    XESuccess("XE000000", 0),

    BQTimeOut_1("BQ000005", 1),
    BQTimeOut_2("BQ000003", 1),
    BWTimeOut_1("BW000003", 1),
    BWTimeOut_2("BW000002", 1),
    U1TimeOut_1("U1000002", 1),
    WLTimeOut_1("WL000002", 1),
    XETimeOut_1("XE000002", 1);

    public static int getResultFlg(String resultCod) {
        for (AuthResultEnum r : AuthResultEnum.values()) {
            if (r.getResultCod().equals(resultCod)) {
                return r.getResultFlag();
            }
        }

        return 99;
    }

    private final String resultCod;
    private final int resultFlag;

    AuthResultEnum(String resultCod, int resultFlag) {
        this.resultCod = resultCod;
        this.resultFlag = resultFlag;
    }

    public String getResultCod() {
        return resultCod;
    }

    public int getResultFlag() {
        return resultFlag;
    }
}
