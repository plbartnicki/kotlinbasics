package entities

/* dzieki data:
  - automayczne dodanie equals i hashCode
  - .. toString()
  - .. copy()

 */
data class Player(val name: String, var active:Boolean)