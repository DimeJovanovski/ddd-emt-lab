package mk.ukim.finki.emt.lab.module.bicyclerent.domain.model;

import lombok.NonNull;
import mk.ukim.finki.emt.lab.module.sharedkernel.domain.base.DomainObjectId;

public class BicycleId extends DomainObjectId {
    private BicycleId() {
        super(BicycleId.randomId(BicycleId.class).getId());
    }

    public BicycleId(@NonNull String uuid) {
        super(uuid);
    }
}
