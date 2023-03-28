package delevery.domain;

import delevery.domain.*;
import delevery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MenuPaid extends AbstractEvent {

    private Long id;

    public MenuPaid(Order aggregate) {
        super(aggregate);
    }

    public MenuPaid() {
        super();
    }
}
