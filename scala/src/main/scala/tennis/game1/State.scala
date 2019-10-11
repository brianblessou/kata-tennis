package tennis.game1

object State {
  def decide(score1 : Int, score2 : Int) : Situation = {
    if (score1==score2)
    {
      Equality
    }
    else if (score1>=4 || score2>=4)
    {
      EndZone
    }
    else
    {
      Usual
    }
  }
}
