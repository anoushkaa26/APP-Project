package app.food;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepo orderRepo;

    @Override
    public Order createOrder(Order order) {
        OrderEntity orderEntity = new OrderEntity();
        BeanUtils.copyProperties(order, orderEntity);
        orderRepo.save(orderEntity);
        return order;
    }
    
}
