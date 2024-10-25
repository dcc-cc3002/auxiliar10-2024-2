package unit
import factory.{SwordFactory, WeaponFactory}

class Warrior(name: String, hp: Int) extends AbstractUnit(name, hp) {

  override val factories: List[WeaponFactory] = List(new SwordFactory)
}
