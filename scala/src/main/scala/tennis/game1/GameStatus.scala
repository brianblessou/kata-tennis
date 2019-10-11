package tennis.game1

class GameStatus(scorePlayer1: Int, scorePlayer2: Int) extends Game1Int {

  /**
   *
   * @param score
   * @return
   */
  def convScore(score: Int): String = {
    score match {
      case 0 => "Love"
      case 1 => "Fifteen"
      case 2 => "Thirty"
      case 3 => "Forty"
    }
  }

  /**
   *
   * @param scorePlayer1 Int between 0 and 2
   * @param scorePlayer2 Int between 0 and 2
   * @return
   * @author Robin CAVALIERI
   */
  def calculateScore(): String = {
    convScore(scorePlayer1) + "-" + convScore(scorePlayer2)
  }

}
