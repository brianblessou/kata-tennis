package tennis.game1

import tennis.TennisGame
import tennis.exceptions.UnknownPlayerException


class TennisGame1(val player1Name: String, val player2Name: String) extends TennisGame {
  var p1Points: Int = 0 // points won by player 1
  var p2Points: Int = 0 // points won by player 2
  val p2Name = "player2"
  val p1Name = "player1"

  /**
   * Adds a point to the player score
   * @param playerName player that scored a point
   * @throws [[tennis.exceptions.UnknownPlayerException]]
   */
  @throws(classOf[UnknownPlayerException])
  def wonPoint(playerName: String) {
    if (playerName == p1Name)
      p1Points += 1
    else if(playerName == p2Name)
      p2Points += 1
    else
      throw UnknownPlayerException(playerName)
  }

  /**
   * Calculates the score of the game
   * @return the score
   */
  def calculateScore(): String = {
    val factory = new GameSituationFactory(p1Points, p2Points)
    factory.create().score(p1Points, p2Points)
  }
}