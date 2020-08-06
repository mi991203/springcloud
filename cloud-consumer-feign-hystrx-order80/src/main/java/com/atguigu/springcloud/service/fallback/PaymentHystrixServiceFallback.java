package com.atguigu.springcloud.service.fallback;

import com.atguigu.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

@Component
public class PaymentHystrixServiceFallback implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------------paymentInfo_OK----------------over";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----------------------paymentInfo_TimeOut------------------------over";
    }
}
