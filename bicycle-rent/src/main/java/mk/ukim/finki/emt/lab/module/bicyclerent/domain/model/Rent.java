package mk.ukim.finki.emt.lab.module.bicyclerent.domain.model;

import jakarta.persistence.*;
import mk.ukim.finki.emt.lab.module.bicyclerent.domain.valueobjects.CustomerId;
import mk.ukim.finki.emt.lab.module.bicyclerent.domain.valueobjects.Money;
import mk.ukim.finki.emt.lab.module.sharedkernel.domain.base.AbstractEntity;

import java.time.Duration;
import java.time.LocalDateTime;

@Entity
@Table(name = "rent")
public class Rent extends AbstractEntity<RentId> {
    private LocalDateTime taken_on;
    private LocalDateTime returned_on;
    @Enumerated(value = EnumType.STRING)
    private RentState rent_state;
    private Money total;
    @AttributeOverride(name = "id", column = @Column(name = "customer_id", nullable = false))
    private CustomerId customer_id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Bicycle bicycle;

    public Rent() {
        super(RentId.randomId(RentId.class));
        this.taken_on = LocalDateTime.now();
        this.rent_state = RentState.VALID;
        this.bicycle.getBicycle();
    }

    public Money returnBicycleAndCalculateTotalPrice(LocalDateTime returned_on) {
        this.returned_on = returned_on;
        this.rent_state = RentState.EXPIRED;
        this.bicycle.returnBicycle();
        long total_price = (Duration.between(this.taken_on, this.returned_on)).toMinutes() * 9;     // 9 den. per minute
        this.total = new Money(total_price);
        return this.total;
    }
}
