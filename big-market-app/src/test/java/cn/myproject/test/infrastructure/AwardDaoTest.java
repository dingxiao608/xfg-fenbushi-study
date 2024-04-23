package cn.myproject.test.infrastructure;

import cn.myproject.infrastructure.persistent.dao.IAwardDao;
import cn.myproject.infrastructure.persistent.dao.IStrategyAwardDao;
import cn.myproject.infrastructure.persistent.dao.IStrategyDao;
import cn.myproject.infrastructure.persistent.dao.IStrategyRuleDao;
import cn.myproject.infrastructure.persistent.po.Award;
import cn.myproject.infrastructure.persistent.po.Strategy;
import cn.myproject.infrastructure.persistent.po.StrategyAward;
import cn.myproject.infrastructure.persistent.po.StrategyRule;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 奖品持久化单元测试
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {

    @Resource
    private IAwardDao awardDao;

    @Resource
    private IStrategyRuleDao strategyRuleDao;

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyAwardDao strategyAwardDao;

    @Test
    public void test_queryAwardList() {
        List<Award> awards = awardDao.queryAwardList();
        log.info("测试结果：{}", JSON.toJSONString(awards));
    }

    @Test
    public void test_queryStrategyRuleList() {
        List<StrategyRule> strategyRules = strategyRuleDao.queryStrategyRuleList();
        log.info("测试结果：{}", JSON.toJSONString(strategyRules));
    }

    @Test
    public void test_queryStrategyList() {
        List<Strategy> strategies = strategyDao.queryStrategyList();
        log.info("测试结果：{}", JSON.toJSONString(strategies));
    }

    @Test
    public void test_queryStrategyAwardList() {
        List<StrategyAward> strategyAwards = strategyAwardDao.queryStrategyAwardList();
        log.info("测试结果：{}", JSON.toJSONString(strategyAwards));
    }

}

