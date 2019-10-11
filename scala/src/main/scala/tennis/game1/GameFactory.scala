package tennis.game1

class GameFactory(scorePlayer1: Int, scorePlayer2: Int)  {

  def createGame() = {

    if (scorePlayer1 == scorePlayer2)
    {
      new GameEquality(scorePlayer1).calculateScore()
    }
    else if (scorePlayer1>=4 || scorePlayer2>=4)
    {
      new GameEnd(scorePlayer1, scorePlayer2).calculateScore()
    }
    else
    {
      new GameStatus(scorePlayer1, scorePlayer2).calculateScore()
    }

  }

}
