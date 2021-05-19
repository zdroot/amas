package com.control;

import com.alibaba.fastjson.JSONObject;
import com.pojo.User;
import com.service.ILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class Login {
   /* @Autowired
   //可以写@Service("lg1)中的lg1也可以写该实现类的小写如loginService2
    @Qualifier("lg1")
    ILogin iLogin;*/

   //作用等同于 @Autowired
    //按照@Service("lg1") name="1g1"
  /* @Resource(name = "lg1")*/

    //根据类型给ilogin赋值 不支持实现类 参考控制反转IOC中测试方法的context.getbean
    //等同于@Autowired 不支持有多个实现类
  /* @Resource(type = ILogin.class)*/

    @Resource(type = ILogin.class,name = "lg1")
   ILogin iLogin;
    @RequestMapping("lg")
    @ResponseBody
    public String login(User user){
        System.out.println("控制层的login方法");
        iLogin.login(user);
        JSONObject js = new JSONObject();
        js.put("k1","aaa");
        js.put("k2","bbb");
        return js.toString();
    }
}
