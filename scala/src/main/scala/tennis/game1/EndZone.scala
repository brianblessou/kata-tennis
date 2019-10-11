package tennis.game1

object EndZone extends Situation {

  /**
   * handles end of the game
   * @param score1
   * @param score2
   * @return
   */
  def getResult(score1 : Int, score2 : Int) : String = {
    val minusResult = score1-score2
    minusResult match {
      case 1 => "Advantage player1"
      case -1 => "Advantage player2"
      case 2 | 3 | 4 => "Win for player1"
      case _ => "Win for player2"
    }
  }
}
