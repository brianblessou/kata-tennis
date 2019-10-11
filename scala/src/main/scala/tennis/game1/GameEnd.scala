package tennis.game1

class GameEnd(scorePlayer1: Int, scorePlayer2: Int) extends Game1Int {

  /**
   *
   * @param minusResult
   * @return
   */
  def getMatchStatus(minusResult: Int) : String = {
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

  /**
   *
   * @return score
   * @author Robin CAVALIERI
   */
  def calculateScore() : String = {
    getMatchStatus(scorePlayer1-scorePlayer2)
  }

}
