package com.sabre.base.pojo.param.resp;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * FileName: RespInfoResult
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-03-10
 */
@Data
@AllArgsConstructor
public class RespInfoResult {

    private RespHeadResult head;

    private RespBodyResult body;


}
