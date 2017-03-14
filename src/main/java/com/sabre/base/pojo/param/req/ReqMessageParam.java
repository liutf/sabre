package com.sabre.base.pojo.param.req;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * FileName: ReqMessageParam
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-10
 */
@Data
@AllArgsConstructor
public class ReqMessageParam {

    private ReqHeadParam head;

    private String body;

}
