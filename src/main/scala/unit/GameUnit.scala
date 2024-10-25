package unit

import weapon.Weapon

import scala.collection.mutable.ArrayBuffer

trait GameUnit {
  def getInventory: ArrayBuffer[Weapon]
  def initializeInventory(x: Int): Unit
}
