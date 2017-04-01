package com.sabre.base.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import org.apache.commons.collections.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;

/**
 * FileName: BaseController
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-10
 */
//@RequestMapping(value = "/")
public class BaseController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected static final String APPLICATION_JSON = "application/json; charset=UTF-8";


    /**
     * 获取HttpServletRequest
     *
     * @return
     */
    protected HttpServletRequest getHttpServletRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    /**
     * 获取HttpServletResponse
     *
     * @return
     */
    protected HttpServletResponse getHttpServletResponse() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
    }

    private void logReadParam(Map<String, String[]> paramsMap) {
        if (CollectionUtils.isEmpty(paramsMap)) {
            logger.error("read param is empty");
        }

    }

    private void logRequestParam(){

        HttpServletRequest request = getHttpServletRequest();
        String paramStr = "";
        Map<String, String[]> parameterMap = request.getParameterMap();
        if(MapUtils.isNotEmpty(parameterMap)){
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String[]> e : parameterMap.entrySet()) {
                String fieldName = e.getKey();
                sb.append(fieldName + "=" + Arrays.toString(e.getValue()) + "&");
            }
            if (sb.length() != 0) {
                paramStr = sb.substring(0, sb.length() - 1);
            }
        }

        logger.info("Request URL: {}",request.getRequestURL().toString());
        logger.info("HTTP Request Type: {}",request.getMethod());
        logger.info("Request IP: {}",request.getRemoteAddr());
        logger.info("Request URL: {}()" ,request.getRequestURI());
        logger.info("Request Class: {}" ,getClass().getName());
        logger.info("Request Params: {}" ,paramStr);
    }

    /**
     * 对象转换成数据写到输出流
     *
     * @param value
     * @throws Exception
     */
    protected void writeValue(Object value) throws Exception {
        writeValue(getHttpServletResponse(), value);
    }

    /**
     * 对象转换成数据写到输出流
     *
     * @param value
     * @throws Exception
     */
    protected void writeValue(HttpServletResponse response, Object value) throws Exception {
        Preconditions.checkNotNull(value, "输出结果不能为空");
        response.setContentType(APPLICATION_JSON);
        writeResultAsJSON(response.getOutputStream(), value);
    }

    protected void writeResultAsJSON(OutputStream os, Object value) throws Exception {

        JSON.writeJSONString(os,value);

        logWriteJSON(value);
    }

    /** 打印写出JSON日志 */
    private void logWriteJSON(Object value) throws Exception {

    }


}
