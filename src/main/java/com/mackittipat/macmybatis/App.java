package com.mackittipat.macmybatis;

import com.mackittipat.macmybatis.dao.CustomerDAO;
import com.mackittipat.macmybatis.dao.OrderProductDAO;
import com.mackittipat.macmybatis.dao.ProductDAO;
import com.mackittipat.macmybatis.domain.OrderProduct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private OrderProductDAO orderProductDAO;

    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

//        Product product = productDAO.findById(3L);
//        log.debug("product={}", product.toString());
//
//        Customer customer = customerDAO.findById(1L);
//        log.debug("customer={}", customer.toString());
//
//        OrderProduct orderProduct = new OrderProduct();
//        orderProduct.setProductName(product.getName());
//        orderProduct.setProductPrice(product.getPrice());
//        orderProduct.setCustomerName(customer.getName());
//        orderProduct.setProduct(product);
//        orderProduct.setCustomer(customer);
//        int insertOrderResult = orderProductDAO.insert(orderProduct);
//        log.debug("insertOrderResult={}", insertOrderResult);

        OrderProduct orderProduct = orderProductDAO.findById2(1L);
        log.debug("orderProduct={}", orderProduct.toString());


//        Product product = productDAO.findById2(3L);
//        log.debug("Product={}", product.toString());

//        Product product = new Product();
//        product.setName("Shirt");
//        product.setPrice(99.99D);
//        product.setCreateDateTime(LocalDateTime.now());
//        int result = productDAO.insert(product);
//        log.debug("Inserted product. result={}", result);

//        Customer customer = new Customer();
//        customer.setName("Mac");
//        customer.setCreateDateTime(LocalDateTime.now());
//        int insertCustomerResult = customerDAO.insert(customer);
//        log.debug("Inserted customer. result={}", insertCustomerResult);

    }
}
