package com.gof.pattern.abstractFactory.after;

import com.gof.pattern.abstractFactory.before.WhiteAnchor;
import com.gof.pattern.abstractFactory.before.WhiteWheel;
import com.gof.pattern.factoryMethod.after.Ship;
import com.gof.pattern.factoryMethod.after.ShipFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShipInventoryTest {

    @Test
    @DisplayName("whiteShipPartsFactory 타입의 배를 만드는 테스트")
    void whiteShipPartsFactory() {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        assertThat(ship.getAnchor().getClass()).isEqualTo(WhiteAnchor.class);
        assertThat(ship.getWheel().getClass()).isEqualTo(WhiteWheel.class);
    }

    @Test
    @DisplayName("whiteShipPartsProFactory 타입의 배를 만드는 테스트")
    void whiteShipPartsProFactory() {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        assertThat(ship.getAnchor().getClass()).isEqualTo(WhiteAnchorPro.class);
        assertThat(ship.getWheel().getClass()).isEqualTo(WhiteWheelPro.class);
    }
}