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

  def calculateScore() : String = {
      var score : String = ""
      if (m_score1==m_score2)
      {
        return calculateEqualScore()
      }
      else if (m_score1>=4 || m_score2>=4)
      {
        return calculateScoreAboveFour()
      }
      else
      {
          return calculateScoreUnderFour()
      }
  }

  def calculateEqualScore() : String = {
    m_score1 match {
      case 0 =>  "Love-All"
      case 1 => "Fifteen-All"
      case 2 => "Thirty-All"
      case _ => "Deuce"
    }
  }

  def calculateScoreAboveFour() : String = {
    val minusResult = m_score1-m_score2
    if (minusResult==1) "Advantage player1"
    else if (minusResult == -1) "Advantage player2"
    else if (minusResult>=2) "Win for player1"
    else "Win for player2"
  }

  def calculateScoreUnderFour() : String = {
    return matchScore(m_score1)+"-"+matchScore(m_score2)
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