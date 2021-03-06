package com.cui.web;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cjs
 * Date： 2017/7/20.
 * Time： 10:40.
 */
@RestController("tall")
public class UserTall {
    private static Logger logger = LogManager.getLogger(UserTall.class);

    public  JSONObject sendMassage( String msg ) {
        String[] split = msg.split("%");
        Map<String ,Object> map =new HashMap<String,Object>();
        map.put("msg",split[0]);
        map.put("userName",split[1]);
        return JSONObject.parseObject(map.toString());
    }
}
