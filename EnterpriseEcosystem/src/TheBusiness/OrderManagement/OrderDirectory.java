/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.OrderManagement;

import java.util.ArrayList;

/**
 *
 * @author sakshiwadaskar
 */
public class OrderDirectory {

    ArrayList<Order> orders;

    public OrderDirectory() {
        orders = new ArrayList<>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void deleteOrder(Order order) {
        this.orders.remove(order);
    }

    public Order findOrderItem(String id) {
        for (Order order : orders) {
            if (order.getOrderId().equals(id)) {
                return order;
            }
        }
        return null;
    }

}
