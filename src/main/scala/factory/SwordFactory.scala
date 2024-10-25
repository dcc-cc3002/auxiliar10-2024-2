package factory
import weapon.{Sword, Weapon}

import scala.util.Random

class SwordFactory extends AbstractWeaponFactory {

  override def create(): Weapon = new Sword(f"Sword $getIndex", Random.between(20, 40))
}
