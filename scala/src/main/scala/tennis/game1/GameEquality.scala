package tennis.game1

class GameEquality(score: Int) {

  /**
   *
   * @param score Int between 0 and 2
   * @return scoreConv
   * @author Robin CAVALIERI
   */
  def calculateScore() : String = {
    score match {
      case 0 =>  "Love-All"
      case 1 => "Fifteen-All"
      case 2 => "Thirty-All"
      case _ => "Deuce"
    }
  }

}
