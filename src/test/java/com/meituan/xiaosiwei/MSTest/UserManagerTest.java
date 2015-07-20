package com.meituan.xiaosiwei.MSTest;

import com.meituan.xiaosiwei.MSTest.domain.UserDO;
import com.meituan.xiaosiwei.MSTest.manager.UserManager;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* UserManager Tester. 
* 
* @author <Authors name> 
* @since <pre>七月 20, 2015</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserManagerTest {

    @Autowired
    private UserManager userManager;

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getUserDO() 
* 
*/ 
@Test
public void testGetUserDO() throws Exception { 
//TODO: Test goes here...
    UserDO userDO = userManager.getUserDO(1);
    Assert.assertEquals(userDO.getUser_name(),"余海洋");
} 


} 
