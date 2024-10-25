package unit
import factory.{KnifeFactory, StaffFactory, WeaponFactory}

class Mage(name: String, hp: Int) extends AbstractUnit(name, hp) {

  override val factories: List[WeaponFactory] = List(new KnifeFactory, new StaffFactory)
}
