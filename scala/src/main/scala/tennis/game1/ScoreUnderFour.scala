package tennis.game1

class ScoreUnderFour(score1 : Int, score2 : Int) extends CalculateScore {
  def getScore() : String = {
    matchScore(score1)+"-"+matchScore(score2)
  }

  def matchScore(score : Int) : String = {
    score match {
      case 0 => "Love"
      case 1 => "Fifteen"
      case 2 => "Thirty"
      case 3 => "Forty"
    }
  }
}
