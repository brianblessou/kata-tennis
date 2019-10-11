package tennis.game1

class AdvantagesHandling(m_score1:Int,m_score2:Int) extends GameOneInterface{

  /**
   *
   * @param minusResult
   * Case when we will handle advantages
   */
  def getAdvantages(minusResult: Int): String = {


    if (minusResult == 1) {
      "Advantage player1"
    }
    else if (minusResult == -1) {
      "Advantage player2"
    }
    else if (minusResult >= 2) {
      "Win for player1"
    }
    else {
      "Win for player2"
    }
  }

  override def getResult():String={
    val minusResult = m_score1 - m_score2
    getAdvantages(minusResult)
  }

}
