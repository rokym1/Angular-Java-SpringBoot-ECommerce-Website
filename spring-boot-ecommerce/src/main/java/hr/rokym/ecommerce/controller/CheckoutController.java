package hr.rokym.ecommerce.controller;

import hr.rokym.ecommerce.dto.Purchase;
import hr.rokym.ecommerce.dto.PurchaseResponse;
import hr.rokym.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return  purchaseResponse;
    }
}
