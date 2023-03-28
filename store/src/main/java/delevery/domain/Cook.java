package delevery.domain;

import delevery.StoreApplication;
import delevery.domain.ConfirmedOrder;
import delevery.domain.CookFinished;
import delevery.domain.RejectedOrder;
import delevery.domain.StartedCooking;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Cook_table")
@Data
public class Cook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String orderId;

    private String foodId;

    private String option;

    private String status;

    private String address;

    @PostPersist
    public void onPostPersist() {
        StartedCooking startedCooking = new StartedCooking(this);
        startedCooking.publishAfterCommit();

        RejectedOrder rejectedOrder = new RejectedOrder(this);
        rejectedOrder.publishAfterCommit();

        ConfirmedOrder confirmedOrder = new ConfirmedOrder(this);
        confirmedOrder.publishAfterCommit();

        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();
    }

    public static CookRepository repository() {
        CookRepository cookRepository = StoreApplication.applicationContext.getBean(
            CookRepository.class
        );
        return cookRepository;
    }

    public void acceptOrReject(AcceptOrRejectCommand acceptOrRejectCommand) {}

    public void startCook() {}

    public void finishCook() {}

    public static void loadOrderInfo(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        Cook cook = new Cook();
        repository().save(cook);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(cook->{
            
            cook // do something
            repository().save(cook);


         });
        */

    }

    public static void loadOrderInfo(OrderCanceled orderCanceled) {
        /** Example 1:  new item 
        Cook cook = new Cook();
        repository().save(cook);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(cook->{
            
            cook // do something
            repository().save(cook);


         });
        */

    }
}
