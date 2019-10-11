package tennis.game3

import tennis.TennisGame

class TennisGame3 (val player1Name : String, val player2Name : String) extends TennisGame {

  private var score2 : Int = 0
  private var score1 : Int = 0

  /**
   *
   * @return
   */
  def calculateScore() : String = {
    var s : String = ""
    if (score1 < 4 && score2 < 4 && !(score1 + score2 == 6)) {
      usual(score1, score2)
    } else {
      endZone(score1, score2)
    }
  }

  /**
   *
   * @param playerName
   */
  @throws(classOf[CustomException])
  def wonPoint(playerName : String) {
    if (playerName == "player1")
      this.score1 += 1
    else if(playerName == "player2")
      this.score2 += 1
    else
      throw new CustomException("player not in the game")

  }

  /**
   *
   * @param score1
   * @param score2
   * @return
   */
  def usual(score1 : Int, score2 : Int) : String = {
    val counting  =  Array("Love", "Fifteen", "Thirty", "Forty")
    val score = counting(score1)
    if (score1 == score2) score + "-All"  else  score + "-" + counting(score2)
  }

  /**
   *
   * @param score1
   * @param score2
   * @return
   */
  def endZone(score1 : Int, score2 : Int) : String = {
    if (score1 == score2) "Deuce"
    else  {
      endGame(score1, score2)
    }
  }

  def endGame(score1 : Int, score2 : Int) : String = {
    val playerAhead = winning(score1, score2)
    if ((score1-score2)*(score1-score2) == 1) "Advantage " + playerAhead  else "Win for " + playerAhead
  }

  def winning(score1 : Int, score2 : Int) : String ={
    if (score1 > score2)  player1Name
    else player2Name
  }


}