package delevery.domain;

import delevery.domain.*;
import delevery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ConfirmedDelevery extends AbstractEvent {

    private Long id;
    private String orderId;

    public ConfirmedDelevery(Delivery aggregate) {
        super(aggregate);
    }

    public ConfirmedDelevery() {
        super();
    }
}
