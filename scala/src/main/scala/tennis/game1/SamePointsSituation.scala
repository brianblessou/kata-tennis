package tennis.game1

object SamePointsSituation extends GameSituation {
  def score(p1Points: Int, p2Points: Int): String = {
    p1Points match {
      case 0 => "Love-All"
      case 1 => "Fifteen-All"
      case 2 => "Thirty-All"
      case _ => "Deuce"

    }
  }
}
