package delevery.domain;

import delevery.domain.*;
import delevery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RejectedOrder extends AbstractEvent {

    private Long id;

    public RejectedOrder(Cook aggregate) {
        super(aggregate);
    }

    public RejectedOrder() {
        super();
    }
}
