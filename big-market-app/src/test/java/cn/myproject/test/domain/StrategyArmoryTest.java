package cn.myproject.test.domain;


import cn.myproject.domain.strategy.service.armory.IStrategyArmory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyArmoryTest {

    @Resource
    private IStrategyArmory strategyArmory;

    @Test
    public void test_strategy_armory(){
        strategyArmory.assembleLottery(100002L);
    }

    @Test
    public void test_getAssembleRandomVal(){
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID", strategyArmory.getRandomAwardId(100002L));
    }
}
