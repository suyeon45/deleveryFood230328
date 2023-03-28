package delevery.infra;

import delevery.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DeliveryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Delivery>> {

    @Override
    public EntityModel<Delivery> process(EntityModel<Delivery> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/pickup")
                .withRel("pickup")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/confirm")
                .withRel("confirm")
        );

        return model;
    }
}
