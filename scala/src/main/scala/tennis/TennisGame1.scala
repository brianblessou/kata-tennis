package tennis


class TennisGame1(val player1Name: String, val player2Name: String) extends TennisGame {
  var p1Points: Int = 0 // points won by player 1
  var p2Points: Int = 0 // points won by player 2
  val p2Name = "player2"
  val p1Name = "player1"

  /**
   * Adds a point to the player score
   * @param playerName player that scored a point
   */
  def wonPoint(playerName: String) {
    if (playerName == p1Name)
      p1Points += 1
    else
      p2Points += 1
  }

  /**
   * Calculates the score of the game
   * @return the score
   */
  def calculateScore(): String = {
    if (p1Points == p2Points)
      samePointsScoring(p1Points)
    else if (p1Points >= 4 || p2Points >= 4)
      endGameScoring(p1Points,p2Points)
    else // regular scoring
      scorePlayer(p1Points) + "-" + scorePlayer(p2Points)
  }

  /**
   * Calculates the score for one player in the regular case
   * @param points the points of the player
   * @return the score for the player
   */
  def scorePlayer(points : Int): String = {
    points match {
      case 0 => "Love"
      case 1 => "Fifteen"
      case 2 => "Thirty"
      case 3 => "Forty"
    }
  }
  /**
   * Returns the score when both players have the same amount of points
   * @param points the points of both players
   * @return the score
   */
  def samePointsScoring(points : Int): String ={
    points match {
      case 0 => "Love-All"
      case 1 => "Fifteen-All"
      case 2 => "Thirty-All"
      case _ => "Deuce"

    }
  }

  /**
   * Returns the score when at least one player has 4 or more points
   * @param p1Points the points of player 1
   * @param p2Points the points of player 1
   * @return
   */
  def endGameScoring(p1Points: Int, p2Points: Int): String = {
    val minusResult = p1Points - p2Points
    minusResult match {
      case 1 => "Advantage " + p1Name
      case -1 => "Advantage " + p2Name
      case 2 | 3 | 4 => "Win for " + p1Name
      case _ => "Win for " + p2Name
    }
  }

}