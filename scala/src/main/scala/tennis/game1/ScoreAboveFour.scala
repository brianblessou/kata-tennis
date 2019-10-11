package tennis.game1

object ScoreAboveFour {

  def getScore(score1 : Int, score2 : Int) : String ={
    val minusResult = score1-score2
    val player : String = if(minusResult > 0) "player1" else "player2"
    if (minusResult==1) s"Advantage $player"
    else if (minusResult == -1) s"Advantage $player"
    else if (minusResult>=2) s"Win for $player"
    else s"Win for $player"
  }
}
