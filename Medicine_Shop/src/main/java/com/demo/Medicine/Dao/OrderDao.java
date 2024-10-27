package com.demo.Medicine.Dao;

import com.demo.Medicine_Shop.entities.Order;

import java.util.List;

public interface OrderDao {
    void saveOrder(Order order);
    void updateOrder(Order order);
    void deleteOrder(int orderId);
    Order getOrderById(int orderId);
    List<Order> getAllOrders();
}
