package com.dfh.enter.service.impl;

import com.dfh.enter.entity.TUser;
import com.dfh.enter.mappers.TUserMapper;
import com.dfh.enter.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TUserServiceImpl implements TUserService {
    @Autowired
    private TUserMapper userMapper;
    public List<TUser> findAll(){
        return userMapper.findAll();
    }
}
