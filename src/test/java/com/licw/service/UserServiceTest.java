package com.licw.service;

import com.licw.model.entity.User;
import com.licw.model.vo.UserVO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户服务测试
 *
 * @author licw
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void testAddUser() {
        User user = new User();
        user.setId(2L);
        user.setUserAccount("test");
        user.setUserPassword("test");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void testUpdateUser() {
        User user = new User();
        user.setId(2L);
        user.setUserAccount("222");
        boolean result = userService.updateById(user);
        Assertions.assertTrue(result);
    }

    @Test
    void testDeleteUser() {
        boolean result = userService.removeById(2L);
        Assertions.assertTrue(result);
    }

    @Test
    void testGetUser() {
        User user = userService.getById(1L);
        Assertions.assertNotNull(user);
    }

    @Test
    void userRegister() {
        String userAccount = "licw2";
        String userPassword = "123456";
        String checkPassword = "123456";
        UserVO result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertNotEquals(null, result);
        System.out.println(result.toString());
    }
}