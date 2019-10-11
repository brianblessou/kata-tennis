package tennis.game1

object Usual extends Situation {

  /**
   *
   * @param score
   * @return
   */
  def getResult(score1 : Int, score2 : Int) : String = {
    pointToText(score1) + "-" + pointToText(score2)
  }

  /**
   * transforms numeric points to textual value
   * @param point
   * @return
   */
  def pointToText(point : Int) : String = {
    point match {
      case 0 => "Love"
      case 1 => "Fifteen"
      case 2 => "Thirty"
      case 3 => "Forty"
    }
  }
}
