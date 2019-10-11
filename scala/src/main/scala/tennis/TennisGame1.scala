package tennis


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
      if (score1==score2)
      {
        equality(score1)
      }
      else if (score1>=4 || score2>=4)
      {
        endZone(score1, score2)
      }
      else
      {
        pointToText(score1) + "-" + pointToText(score2)
      }
  }

  /**
   * handles deuces
   * @param score1
   * @return
   */
  def equality(score1 : Int) : String = {
    val score = score1 match {
      case 0 =>  "Love-All"
      case 1 => "Fifteen-All"
      case 2 => "Thirty-All"
      case _ => "Deuce"

    }
    score
  }

  /**
   * handles end of the game
   * @param score1
   * @param score2
   * @return
   */
  def endZone(score1 : Int, score2 : Int) : String = {
    val minusResult = score1-score2
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