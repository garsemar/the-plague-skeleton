package theplague.logic.item.vehicle

import theplague.interfaces.Position
import theplague.logic.item.Item

abstract class Vehicle(timesLeft: Int): Item(timesLeft) {
    fun canMove(from: Position, to: Position){

    }
}