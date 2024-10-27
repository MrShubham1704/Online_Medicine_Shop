package com.demo.Medicine.serviceImpl;


import com.demo.Medicine.Dao.OrderDao;
import com.demo.Medicine.DaoImpl.OrderDaoImpl;
import com.demo.Medicine.service.OrderService;
import com.demo.Medicine_Shop.entities.Order;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    private final OrderDao orderDao;

    public OrderServiceImpl() {
        this.orderDao = new OrderDaoImpl(); // Ensure OrderDaoImpl implements OrderDao
    }

    @Override
    public void saveOrder(Order order) {
        orderDao.saveOrder(order);
    }

    @Override
    public void updateOrder(Order order) {
        orderDao.updateOrder(order);
    }

    @Override
    public void deleteOrder(int orderId) {
        orderDao.deleteOrder(orderId);
    }

    @Override
    public Order getOrderById(int orderId) {
        return orderDao.getOrderById(orderId);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderDao.getAllOrders();
    }
}
