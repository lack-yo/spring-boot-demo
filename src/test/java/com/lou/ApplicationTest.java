package com.lou;

import com.lou.dao.ShareDao;
import com.lou.dao.WxUserDao;
import com.lou.model.ShareDO;
import com.lou.model.WxUserDO;
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
    @Autowired
    private WxUserDao wxUserDao;

    @Test
    public void testShare() {
        ShareDO share = shareDao.selectById(1);
        log.info("share: {}", share.toString());
    }

    @Test
    public void testGetUser() {
        WxUserDO user = wxUserDao.selectById("or6M24ySR7vHZkSmV0o4ztAy919E");
        log.info(user.toString());
    }

    @Test
    public void testInsertUser() {
        WxUserDO user = WxUserDO
                .builder()
                .openId("test")
                .appId("test_app_id")
                .city("杭州")
                .country("中国")
                .headImgUrl("test_img")
                .language("cn")
                .nickname("昵称😈😝😓")
                .sex(1)
                .province("浙江省")
                .build();
        wxUserDao.insert(user);
        WxUserDO user1 = wxUserDao.selectById("test");
        log.info(user1.toString());
    }

}
