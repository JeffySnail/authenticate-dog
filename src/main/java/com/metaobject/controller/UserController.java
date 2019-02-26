package com.metaobject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jeffy
 * @date 2019-02-26
 **/
@RestController
public class UserController {

    @RequestMapping("/user")
    public Map<String, Object> user() {
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("name", "jeffy");

        userMap.put("yellow", "yellow");
        return userMap;
    }
}
