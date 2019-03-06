package com.dfh.enter.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dfh.enter.entity.TUser;
@Mapper
public interface TUserMapper {
	List<TUser> findAll();
}
