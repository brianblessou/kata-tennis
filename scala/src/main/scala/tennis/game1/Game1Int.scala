package tennis.game1

trait score

trait Game1Int {

  var scorePlayer1: Int = 0
  var scorePlayer2: Int = 0

  /**
   *
   * @param playerName
   */
  def wonPoint(playerName : String) {
    if (playerName == "player1")
      scorePlayer1 += 1
    else
      scorePlayer2 += 1
  }

}
