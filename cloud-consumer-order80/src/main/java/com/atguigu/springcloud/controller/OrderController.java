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

    @GetMapping("/consumer/payment/create/{serial}")
    public CommonResult<Payment> create(Payment payment) {
        return openFeignService.create(payment);
    }

    @GetMapping(value = "/consumer/payment/timeout")
    public String getTryTimeOut() {
        return openFeignService.getTryTimeOut();
    }

}
