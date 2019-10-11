package tennis.game1

class GameEnd extends Game1Int {

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
   * @param scorePlayer1 Int between 0 and 2
   * @param scorePlayer2 Int between 0 and 2
   * @return score
   * @author Robin CAVALIERI
   */
  def calculateScore(scorePlayer1: Int, scorePlayer2: Int) : String = {
    getMatchStatus(scorePlayer1-scorePlayer2)
  }

}
