package com.atlili.reggie.service.impl;

import com.atlili.reggie.bean.Employee;
import com.atlili.reggie.mapper.EmployeeMapper;
import com.atlili.reggie.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {


}
