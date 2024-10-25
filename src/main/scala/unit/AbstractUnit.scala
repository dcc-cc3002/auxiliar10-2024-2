package unit

import weapon.Weapon

import scala.collection.mutable.ArrayBuffer

abstract class AbstractUnit(private val name: String, private val maxHp: Int) extends GameUnit {
  
  private var hp = maxHp
  private val inventory = new ArrayBuffer[Weapon]()
  
  override def getInventory: ArrayBuffer[Weapon] = inventory.clone()
}
