package com.lou;

import com.lou.dao.ShareDao;
import com.lou.model.ShareDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ApplicationTest {

    @Autowired
    private ShareDao shareDao;

    @Test
    public void contextLoads() {
        ShareDO share = shareDao.selectById(1);
        log.info("share: {}", share.toString());
    }

}
