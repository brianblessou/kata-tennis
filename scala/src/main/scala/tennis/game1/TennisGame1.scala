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
    playerName match {
      case "player1" =>  score1 += 1
      case "player2" => score2 += 1
      case _ => throw new Exception("player not in the game")
    }
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