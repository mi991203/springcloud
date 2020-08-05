package springcloud.service.impl;


import com.atguigu.springcloud.entities.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloud.dao.PaymentDao;
import springcloud.service.PaymentService;

/**
 * @auther zzyy
 * @create 2020-02-18 10:40
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
//    @Resource
    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
