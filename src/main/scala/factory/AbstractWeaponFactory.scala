package factory

abstract class AbstractWeaponFactory extends WeaponFactory {
  private var lastWeapon = 0
  
  protected def getIndex: Int = {
    lastWeapon += 1
    lastWeapon
  }
}
