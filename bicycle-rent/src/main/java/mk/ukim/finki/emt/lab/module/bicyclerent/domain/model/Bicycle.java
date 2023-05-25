package mk.ukim.finki.emt.lab.module.bicyclerent.domain.model;

import jakarta.persistence.*;
import mk.ukim.finki.emt.lab.module.sharedkernel.domain.base.AbstractEntity;

@Entity
@Table(name = "bicycle")
public class Bicycle extends AbstractEntity<BicycleId> {
    @Enumerated(value = EnumType.STRING)
    private AvailabilityState availability;

    public Bicycle() {
        super(BicycleId.randomId(BicycleId.class));
        this.availability = AvailabilityState.AVAILABLE;
    }

    public void getBicycle() {
        this.availability = AvailabilityState.IN_USE;
    }

    public void returnBicycle() {
        this.availability = AvailabilityState.AVAILABLE;
    }

    public void reportStolenBicycle() {
        this.availability = AvailabilityState.STOLEN;
    }


}
