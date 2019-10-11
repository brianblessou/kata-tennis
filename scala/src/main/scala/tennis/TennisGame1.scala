package tennis


class TennisGame1 (val player1Name : String, val player2Name : String) extends TennisGame {
  var m_score1: Int = 0
  var m_score2: Int = 0

  /**
   *
   * @param playerName
   */
  def wonPoint(playerName : String) {
          if (playerName == "player1")
              m_score1 += 1
          else
              m_score2 += 1
      }

  /**
   *
   * @return
   */
  def calculateScore() : String = {
      var score : String = ""
      var tempScore=0
      if (m_score1==m_score2)
      {
        score = equality(m_score1)
      }
      else if (m_score1>=4 || m_score2>=4)
      {
        score = endZone(m_score1, m_score2)
      }
      else
      {
          score = usual(m_score1, m_score2)
      }
    return score
  }

  /**
   *
   * @param m_score1
   * @return
   */
  def equality(m_score1 : Int) : String = {
    val score = m_score1 match {
      case 0 =>  "Love-All"
      case 1 => "Fifteen-All"
      case 2 => "Thirty-All"
      case _ => "Deuce"

    }
    score
  }

  /**
   *
   * @param m_score1
   * @param m_score2
   * @return
   */
  def endZone(m_score1 : Int, m_score2 : Int) : String = {
    val minusResult = m_score1-m_score2
    val score = minusResult match {
      case 1 => "Advantage player1"
      case -1 => "Advantage player2"
      case 2 | 3 | 4 => "Win for player1"
      case _ => "Win for player2"
    }
    score
  }

  /**
   *
   * @param m_score1
   * @param m_score2
   * @return
   */
  def usual(m_score1 : Int, m_score2 : Int): String = {
    val tempScore1 = pointToText(m_score1)
    val tempScore2 = pointToText(m_score2)
    val score = tempScore1 + "-" + tempScore2
    score
  }

  /**
   *
   * @param point
   * @return
   */
  def pointToText(point : Int) : String = {
    val value = point match {
      case 0 => "Love"
      case 1 => "Fifteen"
      case 2 => "Thirty"
      case 3 => "Forty"
    }
    value
  }

}