package hr.rokym.ecommerce.service;

import hr.rokym.ecommerce.dto.Purchase;
import hr.rokym.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
