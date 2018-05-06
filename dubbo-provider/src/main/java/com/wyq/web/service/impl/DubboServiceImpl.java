package com.wyq.web.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wyq.web.service.DubboService;

import java.util.Random;
import java.util.logging.Logger;

@Service(version = "1.0.0")
public class DubboServiceImpl implements DubboService {
    private static Logger logger = Logger.getLogger("dubbo");
    @Override
    public String sayHello(String name) {
        System.out.println(name);
        System.out.println("---dubbo 发布服务----");
        logger.info("---dubbo 发布服务----");
        return name;
    }
}
