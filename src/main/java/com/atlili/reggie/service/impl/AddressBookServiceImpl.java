package com.atlili.reggie.service.impl;

import com.atlili.reggie.bean.AddressBook;
import com.atlili.reggie.mapper.AddressBookMapper;
import com.atlili.reggie.service.AddressBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
