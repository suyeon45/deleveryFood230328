package delevery.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "OrderState_table")
@Data
public class OrderState {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
