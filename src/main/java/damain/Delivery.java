package damain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
