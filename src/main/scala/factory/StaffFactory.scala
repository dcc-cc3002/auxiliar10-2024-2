package factory
import weapon.{Staff, Weapon}

import scala.util.Random

class StaffFactory extends AbstractWeaponFactory {

  override def create(): Weapon = new Staff(f"Staff $getIndex", Random.between(10, 30))
}
