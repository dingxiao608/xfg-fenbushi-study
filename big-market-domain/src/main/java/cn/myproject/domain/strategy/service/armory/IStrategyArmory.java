package cn.myproject.domain.strategy.service.armory;

/**
 * 策略装配库（兵工厂），负责初始化策略计算
 */
public interface IStrategyArmory {

    /**
     * 装配策略
     */
    void assembleLottery(Long strategyId);

    /**
     * 获取随机奖品
     */
    Integer getRandomAwardId(Long strategyId);
}
