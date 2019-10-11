package tennis.game1

import tennis.TennisGame

class TennisGame1 (val player1Name : String, val player2Name : String) extends  TennisGame {

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
   * @return
   */
  def calculateScore() : String = {

      if (m_score1 == m_score2)
      {
          new GameEquality().calculateScore(m_score1)
      }
      else if (m_score1>=4 || m_score2>=4)
      {
          new GameEnd().calculateScore(m_score1, m_score2)
      }
      else
      {
          new GameStatus().calculateScore(m_score1, m_score2)
      }
  }


}
