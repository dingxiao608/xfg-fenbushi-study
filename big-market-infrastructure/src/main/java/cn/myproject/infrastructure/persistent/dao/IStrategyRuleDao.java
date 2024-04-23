package cn.myproject.infrastructure.persistent.dao;

import cn.myproject.infrastructure.persistent.po.StrategyRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStrategyRuleDao {

    List<StrategyRule> queryStrategyRuleList();
}
