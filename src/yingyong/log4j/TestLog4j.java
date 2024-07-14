package yingyong.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/** log4j */
public class TestLog4j {
    //基于类的名称获取日志对象
    static Logger logger = Logger.getLogger(TestLog4j.class);

    public static void main(String[] args) throws InterruptedException {
        /*进行默认配置
        BasicConfigurator.configure();
        设置日志输出级别
        logger.setLevel(Level.DEBUG);
        进行不同级别的日志输出
        logger.trace("跟踪信息");
        logger.debug("调试信息");
        logger.info("输出信息");
        Thread.sleep(1000);
        logger.warn("警告信息");
        logger.error("错误信息");
        logger.fatal("致命信息");*/

        //Log4j的配置方式按照log4j.properties中的设置进行
        PropertyConfigurator.configure("d:\\yanfa2023\\project\\how2j\\how2j\\src\\log4j.properties");
        for (int i = 0; i < 5; i++) {
            logger.setLevel(Level.DEBUG);
            logger.trace("跟踪信息1");
            logger.debug("调试信息2");
            logger.info("输出信息3");
            logger.warn("警告信息4");
            logger.error("错误信息5");
            logger.fatal("致命信息6");
        }

    }
}
