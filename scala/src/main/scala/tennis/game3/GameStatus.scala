package tennis.game3

class GameStatus(p1: Int, p2: Int, p1N: String, p2N: String) {

  /**
   *
   * @return
   */
  def calculateScore() = {

    val p  =  Array("Love", "Fifteen", "Thirty", "Forty")
    val s = p(p1)
    if (p1 == p2){
      s + "-All"
    }
    else {
      s + "-" + p(p2)
    }

  }

}
