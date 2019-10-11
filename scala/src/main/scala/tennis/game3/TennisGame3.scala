package tennis.game3

import tennis.TennisGame
import tennis.exceptions.UnknownPlayerException

class TennisGame3(val player1Name: String, val player2Name: String) extends TennisGame {

  private var p1Points: Int = 0
  private var p2Points: Int = 0
  private val scoreLabels = Array("Love", "Fifteen", "Thirty", "Forty")

  /**
   * Calculates the score of the game
   * @return the score
   */
  def calculateScore(): String = {
    val isRegular = p1Points < 4 && p2Points < 4 && !(p1Points + p2Points == 6)
    if (isRegular) regularScore(p1Points, p2Points)
    else endGameScore(p1Points, p2Points)
  }

  /**
   * Returns the score for regular situations
   *
   * @param p1Points player 1 points
   * @param p2Points player 2 points
   * @return score string
   */
  private def regularScore(p1Points: Int, p2Points: Int): String = {
    if (p1Points == p2Points) scoreLabels(p1Points) + "-All"
    else scoreLabels(p1Points) + "-" + scoreLabels(p2Points)
  }

  /**
   * Returns the score for end game situations
   *
   * @param p1Points player 1 points
   * @param p2Points player 2 points
   * @return score string
   */
  private def endGameScore(p1Points: Int, p2Points: Int): String = {
    if (p1Points == p2Points) "Deuce"
    else {
      val playerAhead = if (p1Points > p2Points) player1Name else player2Name
      if ((p1Points - p2Points) * (p1Points - p2Points) == 1) "Advantage " + playerAhead else "Win for " + playerAhead
    }
  }

  /**
   * Adds a point to the player score
   * @param playerName player that scored a point
   * @throws [[tennis.exceptions.UnknownPlayerException]]
   */
  @throws(classOf[UnknownPlayerException])
  def wonPoint(playerName: String) {
    if (playerName == "player1")
      p1Points += 1
    else if(playerName == "player2")
      p2Points += 1
    else
      throw UnknownPlayerException(playerName)
  }

}