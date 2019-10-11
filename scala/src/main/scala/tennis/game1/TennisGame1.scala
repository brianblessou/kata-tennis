package tennis.game1
import tennis.TennisGame
import tennis.game1.FactoryGame

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
    new FactoryGame (m_score1,m_score2).createItem().getResult()
  }




}