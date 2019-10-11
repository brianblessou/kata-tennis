package tennis.game1

object EqualScore {

  def getScore(score : Int): String ={
    score match {
      case 0 =>  "Love-All"
      case 1 => "Fifteen-All"
      case 2 => "Thirty-All"
      case _ => "Deuce"
    }
  }
}
