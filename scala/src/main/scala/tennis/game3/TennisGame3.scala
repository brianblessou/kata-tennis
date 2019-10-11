package tennis.game3

import tennis.TennisGame

class TennisGame3 (val p1N : String, val p2N : String) extends TennisGame {

  var p2 : Int = 0
  var p1 : Int = 0

  /**
   *
   * @param playerName
   */
  def wonPoint(playerName : String) {
    if (playerName == "player1")
      p1 += 1
    else
      p2 += 1
  }

  /**
   *
   * @return
   */
  def calculateScore() : String = {
    new GameFactory(p1, p2).createGame()
  }

}