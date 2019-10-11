package tennis.game3

class GameEnd(p1: Int, p2: Int, p1N: String, p2N: String) {

  /**
   *
   * @return
   */
  def getPlayer(): String = {
    if (p1 > p2) {
      p1N
    }
    else {
      p2N
    }
  }

  /**
   *
   * @return
   */
  def calculateScore() = {

    val s = getPlayer()

    if (p1 == p2) {
      "Deuce"
    }
    else {
      if ((p1 - p2) * (p1 - p2) == 1) {
        "Advantage " + s
      }
      else {
        "Win for " + s
      }
    }

  }

}
