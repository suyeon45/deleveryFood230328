package delevery.domain;

import delevery.domain.*;
import delevery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private String orderId;
    private String address;

    public CookFinished(Cook aggregate) {
        super(aggregate);
    }

    public CookFinished() {
        super();
    }
}
