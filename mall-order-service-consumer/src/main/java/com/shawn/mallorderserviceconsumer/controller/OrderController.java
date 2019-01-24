package com.shawn.mallorderserviceconsumer.controller;

import com.shawn.bean.UserAddress;
import com.shawn.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Author shawn
 * @create 2019/1/24 0024
 */
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId){
        return orderService.initOrder(userId);
    }
}
