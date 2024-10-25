package weapon

class CombinedWeapon(private val leftWeapon: Weapon, private val rightWeapon: Weapon) extends Weapon {

  override def getDamage: Int = ((leftWeapon.getDamage + rightWeapon.getDamage) * 1.5).toInt
}
