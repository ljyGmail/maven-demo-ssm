package com.atguigu.imperial.court.service.api;

import com.atguigu.imperial.court.entity.Emp;

/**
 * ClassName: EmpService
 * Package: com.atguigu.imperial.court.service.api
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 5. 1. 오후 2:29
 * @Version 1.0
 */
public interface EmpService {
    Emp getEmpByLogin(String loginAccount, String loginPassword);
}
