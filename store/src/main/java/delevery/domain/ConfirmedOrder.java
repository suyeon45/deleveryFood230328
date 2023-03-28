package delevery.domain;

import delevery.domain.*;
import delevery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ConfirmedOrder extends AbstractEvent {

    private Long id;

    public ConfirmedOrder(Cook aggregate) {
        super(aggregate);
    }

    public ConfirmedOrder() {
        super();
    }
}
