package delevery.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import delevery.config.kafka.KafkaProcessor;
import delevery.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    OrderRepository orderRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='MenuPaid'"
    )
    public void wheneverMenuPaid_Order(@Payload MenuPaid menuPaid) {
        MenuPaid event = menuPaid;
        System.out.println("\n\n##### listener Order : " + menuPaid + "\n\n");

        // Sample Logic //
        Order.order(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StartedCooking'"
    )
    public void wheneverStartedCooking_UpdateState(
        @Payload StartedCooking startedCooking
    ) {
        StartedCooking event = startedCooking;
        System.out.println(
            "\n\n##### listener UpdateState : " + startedCooking + "\n\n"
        );

        // Sample Logic //
        Order.updateState(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FoodPicked'"
    )
    public void wheneverFoodPicked_UpdateState(@Payload FoodPicked foodPicked) {
        FoodPicked event = foodPicked;
        System.out.println(
            "\n\n##### listener UpdateState : " + foodPicked + "\n\n"
        );

        // Sample Logic //
        Order.updateState(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderPlaced'"
    )
    public void wheneverOrderPlaced_UpdateState(
        @Payload OrderPlaced orderPlaced
    ) {
        OrderPlaced event = orderPlaced;
        System.out.println(
            "\n\n##### listener UpdateState : " + orderPlaced + "\n\n"
        );

        // Sample Logic //
        Order.updateState(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderCanceled'"
    )
    public void wheneverOrderCanceled_UpdateState(
        @Payload OrderCanceled orderCanceled
    ) {
        OrderCanceled event = orderCanceled;
        System.out.println(
            "\n\n##### listener UpdateState : " + orderCanceled + "\n\n"
        );

        // Sample Logic //
        Order.updateState(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CookFinished'"
    )
    public void wheneverCookFinished_UpdateState(
        @Payload CookFinished cookFinished
    ) {
        CookFinished event = cookFinished;
        System.out.println(
            "\n\n##### listener UpdateState : " + cookFinished + "\n\n"
        );

        // Sample Logic //
        Order.updateState(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ConfirmedDelevery'"
    )
    public void wheneverConfirmedDelevery_UpdateState(
        @Payload ConfirmedDelevery confirmedDelevery
    ) {
        ConfirmedDelevery event = confirmedDelevery;
        System.out.println(
            "\n\n##### listener UpdateState : " + confirmedDelevery + "\n\n"
        );

        // Sample Logic //
        Order.updateState(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RejectedOrder'"
    )
    public void wheneverRejectedOrder_UpdateState(
        @Payload RejectedOrder rejectedOrder
    ) {
        RejectedOrder event = rejectedOrder;
        System.out.println(
            "\n\n##### listener UpdateState : " + rejectedOrder + "\n\n"
        );

        // Sample Logic //
        Order.updateState(event);
    }
}
