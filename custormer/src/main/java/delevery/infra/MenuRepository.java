package delevery.infra;

import delevery.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "menus", path = "menus")
public interface MenuRepository
    extends PagingAndSortingRepository<Menu, Long> {}
