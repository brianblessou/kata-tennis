package tennis.game1

object RegularSituation extends GameSituation {
  def score(p1Points: Int, p2Points: Int): String = {
    regularScoringPlayer(p1Points) + "-" + regularScoringPlayer(p2Points)
  }

  /**
   * Calculates the score for one player in the regular case
   * @param points the points of the player
   * @return the score for the player
   */
  def regularScoringPlayer(points : Int): String = {
    points match {
      case 0 => "Love"
      case 1 => "Fifteen"
      case 2 => "Thirty"
      case 3 => "Forty"
    }
  }
}
