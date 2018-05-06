package com.wyq.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wyq.web.service.DubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/dubbo")
public class DubboController {
    private static Logger logger = Logger.getLogger("dubbo");

    //    @Resource
    @Reference(version = "1.0.0")
    DubboService dubboService;

    @RequestMapping("sayHello")
    public String sayHello() {
        System.out.println("dubbo开始调用");
        logger.info("dubbo开始调用");
        return dubboService.sayHello("consumer 请求服务");
    }
}
