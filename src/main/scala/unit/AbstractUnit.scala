package unit

import factory.WeaponFactory
import weapon.Weapon

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

abstract class AbstractUnit(private val name: String, private val maxHp: Int) extends GameUnit {
  
  private var hp = maxHp
  private val inventory = new ArrayBuffer[Weapon]()
  
  val factories: List[WeaponFactory]
  
  override def getInventory: ArrayBuffer[Weapon] = inventory.clone()

  override def initializeInventory(x: Int): Unit = {
    for (i <- 1 to x) {
      inventory += factories(Random.nextInt(factories.size)).create()
    }
  }
}
