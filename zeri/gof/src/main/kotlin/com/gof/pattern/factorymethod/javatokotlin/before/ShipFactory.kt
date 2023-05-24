package com.gof.pattern.factorymethod.javatokotlin.before

class ShipFactory {
    companion object {
        fun orderShip(name: String, email: String): Ship {
            if (name.isBlank()) {
                throw IllegalArgumentException("배 이름을 지어주세요.")
            }

            if (email.isBlank()) {
                throw IllegalArgumentException("연락처를 남겨주세요.")
            }

            prepareFor(name)

            val ship = Ship()
            ship.name = name

            // Customizing for specific name
            if (name.equals("WhiteShip", ignoreCase = true)) {
                ship.logo = "\uD83D\uDEE5️"
            } else if (name.equals("BlackShip", ignoreCase = true)) {
                ship.logo = ("⚓")
            }

            sendEmailTo(email, ship)

            return ship
        }

        private fun sendEmailTo(email: String, ship: Ship) {
            println(ship.name + " 다 만들었습니다.")
        }

        private fun prepareFor(name: String) {
            println(name + "만들 준비 중")
        }
    }
}
