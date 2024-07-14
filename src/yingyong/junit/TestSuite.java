package yingyong.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**Suite:同时执行多个测试类*/
@RunWith(Suite.class)
@Suite.SuiteClasses({TestCase1.class,TestCase2.class})
public class TestSuite {

}
