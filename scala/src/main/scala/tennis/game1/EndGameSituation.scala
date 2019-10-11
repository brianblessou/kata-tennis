package tennis.game1

/**
 * Situation when at least one player has 4 or more points
 */
object EndGameSituation extends GameSituation {
  def score(p1Points: Int, p2Points: Int): String = {
    val minusResult = p1Points - p2Points
    minusResult match {
      case 1 => "Advantage player1"
      case -1 => "Advantage player2"
      case 2 | 3 | 4 => "Win for player1"
      case _ => "Win for player2"
    }
  }
}
