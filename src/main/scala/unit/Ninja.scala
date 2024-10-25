package unit
import factory.{KnifeFactory, SwordFactory, WeaponFactory}

class Ninja(name: String, hp: Int) extends AbstractUnit(name, hp) {

  override val factories: List[WeaponFactory] = List(new SwordFactory, new KnifeFactory)
}
