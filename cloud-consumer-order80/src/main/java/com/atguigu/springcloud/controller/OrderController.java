package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.OpenFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class OrderController {
    @Autowired
    private OpenFeignService openFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> findPaymentById(@PathVariable("id") Long id) {
        return openFeignService.getPaymentById(id);
    }

}
