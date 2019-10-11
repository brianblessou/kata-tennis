package tennis.game1

class EqualityHandling(m_score1: Int) extends GameOneInterface {

  override def getResult(): String = {
    m_score1 match {
      case 0 => "Love-All"
      case 1 => "Fifteen-All"
      case 2 => "Thirty-All"
      case _ => "Deuce"
    }
  }
}
