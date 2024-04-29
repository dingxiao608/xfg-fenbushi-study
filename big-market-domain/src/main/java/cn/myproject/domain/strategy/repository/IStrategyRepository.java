package cn.myproject.domain.strategy.repository;

import cn.myproject.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.HashMap;
import java.util.List;

/**
 * 策略仓储接口
 */
public interface IStrategyRepository {
    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTables(Long strategyId, int rateRange, HashMap<Integer, Integer> shuffleStrategyAwardSearchRateTables);

    int getRateRange(Long strategyId);

    Integer getStrategyAwardAssemble(Long strategyId, int rateKey);
}
