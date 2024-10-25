package factory
import weapon.{Knife, Weapon}

import scala.util.Random

class KnifeFactory extends AbstractWeaponFactory {

  override def create(): Weapon = new Knife(f"Knife $getIndex", Random.between(10, 20))
}
