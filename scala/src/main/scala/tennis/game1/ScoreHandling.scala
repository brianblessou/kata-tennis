package tennis.game1

class ScoreHandling(m_score1:Int, m_score2:Int) extends GameOneInterface {



  override def getResult():String={
    getScore(m_score1) + "-" +  getScore(m_score2)
  }

  def getScore(result:Int)={
    result match {
      case 0 => "Love"
      case 1 => "Fifteen"
      case 2 => "Thirty"
      case 3 => "Forty"
    }
  }

}
