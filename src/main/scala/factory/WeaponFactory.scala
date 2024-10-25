package factory

import weapon.Weapon

trait WeaponFactory {
  def create(): Weapon
}
