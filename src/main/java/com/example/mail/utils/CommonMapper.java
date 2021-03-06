package com.example.mail.utils;

import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

@RegisterMapper
public interface CommonMapper<T> extends Mapper<T>, IdListMapper<T,Long>, IdsMapper<T>, InsertListMapper<T> {
}
