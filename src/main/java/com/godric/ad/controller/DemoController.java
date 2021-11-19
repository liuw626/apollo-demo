package com.godric.ad.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {


    @RequestMapping("getKey")
    public String getKey(String key, String defaultValue) {
        String namespace = "CENTER.apollo.demo";
        Config config = ConfigService.getConfig(namespace);
        return config.getProperty(key, defaultValue);
    }

}
