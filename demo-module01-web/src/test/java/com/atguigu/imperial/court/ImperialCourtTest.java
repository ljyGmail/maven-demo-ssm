package com.atguigu.imperial.court;

import com.alibaba.druid.filter.AutoLoad;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * ClassName: ImperialCourtTest
 * Package: com.atguigu.imperial.court
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 4. 30. 오후 7:08
 * @Version 1.0
 */
// Spring和JUnit5整合
@ExtendWith(SpringExtension.class)
@ContextConfiguration(value = {"classpath:spring-persist.xml"})
public class ImperialCourtTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testDataSource() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println("connection = " + connection);
    }
}
