package tennis.game1

class EqualScore(score : Int) extends CalculateScore {

  def getScore(): String ={
    score match {
      case 0 =>  "Love-All"
      case 1 => "Fifteen-All"
      case 2 => "Thirty-All"
      case _ => "Deuce"
    }
  }
}
