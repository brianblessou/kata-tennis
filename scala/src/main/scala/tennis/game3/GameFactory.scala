package tennis.game3

class GameFactory(p1: Int, p2: Int) {

  /**
   *
   * @return
   */
  def createGame() = {

    if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
      new GameStatus(p1, p2, "player1", "player2").calculateScore()
    }
    else {
      new GameEnd(p1, p2, "player1", "player2").calculateScore()
    }
  }
}
