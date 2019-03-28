package com.xhai.mall.service;

import com.xhai.mall.dto.OssCallbackResult;
import com.xhai.mall.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 * @Author:dolphin
 */
public interface OssService {
    OssPolicyResult policy();
    OssCallbackResult callback(HttpServletRequest request);
}
