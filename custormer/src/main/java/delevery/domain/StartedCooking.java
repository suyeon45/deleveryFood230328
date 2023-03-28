package delevery.domain;

import delevery.domain.*;
import delevery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StartedCooking extends AbstractEvent {

    private Long id;
    private String orderId;
}
