package com.huiztech.muyq.dubbo.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huiztech.muyq.dubbo.provider.domain.Employee;
import com.huiztech.muyq.dubbo.provider.mapper.EmployeeMapper;
import com.huiztech.muyq.dubbo.provider.service.IEmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/13 23:18]
 * @description []
 */
@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {
}
