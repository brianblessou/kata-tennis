package tennis.game1

class GameEquality extends Game1Int {

  /**
   *
   * @param score Int between 0 and 2
   * @return scoreConv
   * @author Robin CAVALIERI
   */
  def calculateScore(score: Int) : String = {
    score match {
      case 0 =>  "Love-All"
      case 1 => "Fifteen-All"
      case 2 => "Thirty-All"
      case _ => "Deuce"
    }
  }

}
