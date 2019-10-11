package tennis.game1

class FactoryGame(m_score1:Int,m_score2:Int){

  def createItem(): GameOneInterface ={

    if(m_score1==m_score2){
      new EqualityHandling(m_score1)
    }
    else if(m_score1 >=4 || m_score2 >=4){
      new AdvantagesHandling(m_score1,m_score2)
    }
    else{
      new ScoreHandling(m_score1,m_score2)
    }
  }

}
