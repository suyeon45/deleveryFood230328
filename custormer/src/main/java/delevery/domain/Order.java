package delevery.domain;

import delevery.CustormerApplication;
import delevery.domain.MenuPaid;
import delevery.domain.OrderCanceled;
import delevery.domain.OrderPlaced;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Order_table")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerId;

    private String foodId;

    private String option;

    private String address;

    private String status;

    @PostPersist
    public void onPostPersist() {
        MenuPaid menuPaid = new MenuPaid(this);
        menuPaid.publishAfterCommit();

        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();
    }

    public static OrderRepository repository() {
        OrderRepository orderRepository = CustormerApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }

    public void cancel() {}

    public static void order(MenuPaid menuPaid) {
        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        OrderPlaced orderPlaced = new OrderPlaced(order);
        orderPlaced.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(menuPaid.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);

            OrderPlaced orderPlaced = new OrderPlaced(order);
            orderPlaced.publishAfterCommit();

         });
        */

    }

    public static void updateState(StartedCooking startedCooking) {
        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(startedCooking.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }

    public static void updateState(FoodPicked foodPicked) {
        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(foodPicked.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }

    public static void updateState(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }

    public static void updateState(OrderCanceled orderCanceled) {
        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }

    public static void updateState(CookFinished cookFinished) {
        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookFinished.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }

    public static void updateState(ConfirmedDelevery confirmedDelevery) {
        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(confirmedDelevery.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }

    public static void updateState(RejectedOrder rejectedOrder) {
        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(rejectedOrder.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }
}
