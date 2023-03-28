package delevery.infra;

import delevery.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "orderStates",
    path = "orderStates"
)
public interface OrderStateRepository
    extends PagingAndSortingRepository<OrderState, Long> {}
