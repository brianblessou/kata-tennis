package tennis.game1

object ScoreFactory {

  def returnObject(score1 : Int, score2 : Int) : CalculateScore = {
    if (score1==score2)
    {
      new EqualScore(score1)
    }
      else if (score1>=4 || score2>=4)
    {
      new ScoreAboveFour(score1, score2)
    }
      else
    {
      new ScoreUnderFour(score1, score2)
    }
  }
}
