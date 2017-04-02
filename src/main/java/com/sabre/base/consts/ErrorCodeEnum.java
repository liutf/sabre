package com.sabre.base.consts;

/**
 * FileName: ErrorCodeEnum
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-04-01
 */
public enum ErrorCodeEnum {
    PARAM_ERROR("10000", "Param is not valid"),
    APP_ID_ERROR("10001", "appId is not valid, invalid value=%s"),
    SIGN_ERROR("10002", "sign is not valid, invalid value=%s")
    ;

    private String errorCode;
    private String errorMsg;

    ErrorCodeEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
