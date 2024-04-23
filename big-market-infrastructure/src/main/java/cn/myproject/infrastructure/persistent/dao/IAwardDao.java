package cn.myproject.infrastructure.persistent.dao;

import cn.myproject.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IAwardDao {

    List<Award> queryAwardList();

}

