package tennis.game1

import tennis.TennisGame

class TennisGame1 (val player1Name : String, val player2Name : String) extends TennisGame {
  var score1: Int = 0
  var score2: Int = 0

  /**
   * add point to winner
   * @param playerName
   */
  def wonPoint(playerName : String) {
          if (playerName == "player1")
              score1 += 1
          else
              score2 += 1
      }

  /**
   * compute score of 2 players
   * @return
   */
  def calculateScore() : String = {
      val situation = State.decide(score1, score2)
      situation.getResult(score1, score2)
  }







}