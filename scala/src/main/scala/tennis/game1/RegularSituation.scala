package tennis.game1

import tennis.exceptions.BadScoreException

object RegularSituation extends GameSituation {
  def score(p1Points: Int, p2Points: Int): String = {
    println(regularScoringPlayer(p1Points) + "-" + regularScoringPlayer(p2Points))
    regularScoringPlayer(p1Points) + "-" + regularScoringPlayer(p2Points)
  }

  /**
   * Calculates the score for one player in the regular case
   * @param points the points of the player
   * @return the score for the player
   */
  private def regularScoringPlayer(points : Int): String = {
    points match {
      case 0 => "Love"
      case 1 => "Fifteen"
      case 2 => "Thirty"
      case 3 => "Forty"
      case _ => throw BadScoreException("Bad Value")
    }
  }
}
