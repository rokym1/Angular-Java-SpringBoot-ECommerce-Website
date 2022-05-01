package hr.rokym.ecommerce.dto;

import hr.rokym.ecommerce.entity.Address;
import hr.rokym.ecommerce.entity.Customer;
import hr.rokym.ecommerce.entity.Order;
import hr.rokym.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
