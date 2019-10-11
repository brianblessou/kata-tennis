package tennis


class TennisGame1 (val player1Name : String, val player2Name : String) extends TennisGame {
  var m_score1: Int = 0
  var m_score2: Int = 0

  def wonPoint(playerName : String) {
          if (playerName == "player1")
              m_score1 += 1
          else
              m_score2 += 1
  }

  /**
   *
   * @param score Int between 0 and 2
   * @return scoreConv
   * @author Robin CAVALIERI
   */
  def equalScore(score: Int) : String = {
    score match {
        case 0 =>  "Love-All"
        case 1 => "Fifteen-All"
        case 2 => "Thirty-All"
        case _ => "Deuce"
    }
  }

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
  def winningScore(scorePlayer1: Int, scorePlayer2: Int) : String = {
    getMatchStatus(scorePlayer1-scorePlayer2)
  }

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
  def diffScore(scorePlayer1: Int, scorePlayer2: Int): String = {
    convScore(scorePlayer1) + "-" + convScore(scorePlayer2)
  }

  /**
   *
   * @return
   */
  def calculateScore() : String = {

      if (m_score1 == m_score2)
      {
          equalScore(m_score1)
      }
      else if (m_score1>=4 || m_score2>=4)
      {
          winningScore(m_score1, m_score2)
      }
      else
      {
          diffScore(m_score1, m_score2)
      }
  }

}
