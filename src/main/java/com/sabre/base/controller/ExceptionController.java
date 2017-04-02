package com.sabre.base.controller;

import com.sabre.base.domain.param.resp.BaseResult;
import com.sabre.base.exception.ParamException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import static com.sabre.base.consts.ErrorCodeEnum.PARAM_ERROR;

/**
 * FileName: ExceptionController
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-04-01
 */
@Slf4j
@ControllerAdvice
public class ExceptionController {


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResult defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        return getResult(req.getRequestURI(),e);
    }


    private BaseResult getResult(String path, Exception ex) {
        BaseResult result = new BaseResult();
        if (ex instanceof ParamException) {
            result = getValidationError(PARAM_ERROR.getErrorCode(), ex.getMessage());
        }
        return result;
    }

    private BaseResult getValidationError(String errorCode,String errorMsg) {
        BaseResult result =  new BaseResult();
        result.setResCode(errorCode);
        result.setResMsg(errorMsg);
        return result;
    }

}
