package delevery.infra;

import delevery.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CookHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Cook>> {

    @Override
    public EntityModel<Cook> process(EntityModel<Cook> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/accept-or-reject"
                )
                .withRel("accept-or-reject")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/startcook")
                .withRel("startcook")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/finishcook")
                .withRel("finishcook")
        );

        return model;
    }
}
