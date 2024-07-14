package yingyong.junit;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class TestCase1 {

    //@Before @After 也是常见的测试框架注解，分别用来在测试开始之前做的事情，和结束之后做的事情。
    @Before
    public void before() {
        System.out.println("测试前的准备工作，比如链接数据库等等");
    }
    @After
    public void after() {
        System.out.println("测试结束后的工作，比如关闭链接等等");
    }

    @Test
    public void testSum1() {
        int result = SumUtil.sum1(1, 2);
        //Assert.assertEquals(result, 3); 表示对 result 数值的期待是 3，如果是其他数值，就无法通过测试。
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testSum2() {
        int result = SumUtil.sum2(1, 2,3);
        Assert.assertEquals(result, 6);
    }
}
