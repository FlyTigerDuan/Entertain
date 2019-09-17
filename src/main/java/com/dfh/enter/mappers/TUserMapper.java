package com.dfh.enter.mappers;

import java.util.List;


import com.dfh.enter.entity.TUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TUserMapper {
	List<TUser> findAll();
}
