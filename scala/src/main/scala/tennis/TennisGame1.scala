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
   * @auth Robin CAVALIERI
   * @desc
   */
  def equalScore(score: Int) : String = {
    val scoreConv = score match {
        case 0 =>  "Love-All"
        case 1 => "Fifteen-All"
        case 2 => "Thirty-All"
        case _ => "Deuce"
    }
    scoreConv
  }

  /**
   *
   * @param scorePlayer1 Int between 0 and 2
   * @param scorePlayer2 Int between 0 and 2
   * @return score
   * @author Robin CAVALIERI
   * @desc
   */
  def winningScore(scorePlayer1: Int, scorePlayer2: Int) : String = {
    var score = ""
    val minusResult = scorePlayer1-scorePlayer2

    if (minusResult == 1) {
      score = "Advantage player1"
    }
    else if (minusResult == -1) {
      score = "Advantage player2"
    }
    else if (minusResult >= 2) {
      score = "Win for player1"
    }
    else {
      score = "Win for player2"
    }
    score
  }

  /**
   *
   * @param scorePlayer1 Int between 0 and 2
   * @param scorePlayer2 Int between 0 and 2
   * @return
   * @author Robin CAVALIERI
   * @desc
   */
  def diffScore(scorePlayer1: Int, scorePlayer2: Int): String = {
    var score = ""
    var tempScore = 0
    for ( i<- 1 until 3 by 1)
    {
      if (i==1) {
        tempScore = scorePlayer1
      }
      else {
        score += "-"
        tempScore = scorePlayer2
      }
      val tempScore2 = tempScore match {
        case 0 => "Love"
        case 1 => "Fifteen"
        case 2 => "Thirty"
        case 3 => "Forty"
      }
      score += tempScore2
    }
    score
  }

  /**
   *
   * @desc depending on the case call diffScore / winningScore / equalScore
   * @return
   */
  def calculateScore() : String = {
      var score : String = ""

      if (m_score1 == m_score2)
      {
          score = equalScore(m_score1)
      }
      else if (m_score1>=4 || m_score2>=4)
      {
          score = winningScore(m_score1, m_score2)
      }
      else
      {
          score = diffScore(m_score1, m_score2)
      }
      score
  }

}