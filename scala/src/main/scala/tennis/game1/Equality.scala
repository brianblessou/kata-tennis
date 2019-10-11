package tennis.game1

object Equality extends Situation {
  /**
   * handles deuces
   * @param score1
   * @param score2
   * @return
   */
  def getResult(score1 : Int, score2: Int) : String = {
    score1 match {
      case 0 =>  "Love-All"
      case 1 => "Fifteen-All"
      case 2 => "Thirty-All"
      case _ => "Deuce"
    }
  }
}
