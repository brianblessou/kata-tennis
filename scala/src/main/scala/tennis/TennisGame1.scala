package tennis


class TennisGame1 (val player1Name : String, val player2Name : String) extends TennisGame {
  var m_score1: Int = 0
  var m_score2: Int = 0

  /**
   * add point to winner
   * @param playerName
   */
  def wonPoint(playerName : String) {
          if (playerName == "player1")
              m_score1 += 1
          else
              m_score2 += 1
      }

  /**
   * compute score of 2 players
   * @return
   */
  def calculateScore() : String = {
      if (m_score1==m_score2)
      {
        equality(m_score1)
      }
      else if (m_score1>=4 || m_score2>=4)
      {
        endZone(m_score1, m_score2)
      }
      else
      {
        pointToText(m_score1) + "-" + pointToText(m_score2)
      }
  }

  /**
   * handles deuces
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
   * handles end of the game
   * @param m_score1
   * @param m_score2
   * @return
   */
  def endZone(m_score1 : Int, m_score2 : Int) : String = {
    val minusResult = m_score1-m_score2
    minusResult match {
      case 1 => "Advantage player1"
      case -1 => "Advantage player2"
      case 2 | 3 | 4 => "Win for player1"
      case _ => "Win for player2"
    }
  }

  /**
   * transforms numeric points to textual value
   * @param point
   * @return
   */
  def pointToText(point : Int) : String = {
    point match {
      case 0 => "Love"
      case 1 => "Fifteen"
      case 2 => "Thirty"
      case 3 => "Forty"
    }
  }

}