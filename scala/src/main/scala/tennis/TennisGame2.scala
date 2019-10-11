package tennis



class TennisGame2 (val player1Name : String, val player2Name : String) extends TennisGame {

    private var P1point = 0
    private var P2point  = 0

    def calculateScore() : String = {
        if (P1point == P2point)
          equal(P1point)
        else if (P1point > 0 && P1point < 4 && P2point==0)
          scoringLove(P1point, player1Name)
        else if (P2point > 0 && P2point < 4 && P1point==0)
          scoringLove(P2point, player2Name)
        else if ((P1point < P2point && P2point < 4) || (P2point < P1point && P1point < 4))
          scoring(P1point) + "-" + scoring(P2point)
        else if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
          "Win for player1"
        else if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
          "Win for player2"
        else if (P1point > P2point && P2point >= 3)
            "Advantage player1"
        else if (P2point > P1point && P1point >= 3)
            "Advantage player2"
        else throw new Exception("score not in range of valid values")
    }

    def SetP1Score(number : Int) {

        for (i <- 0 until number by 1)
        {
            P1Score()
        }

    }

    def SetP2Score(number : Int){

      for (i <- 0 until number by 1)
        {
            P2Score()
        }

    }

    def P1Score(){
        P1point += 1
    }

  /**
   *
   */
    def P2Score(){
        P2point +=1
    }

  /**
   *
   * @param player
   */
    def wonPoint(player : String) {
        if (player == "player1") P1Score()
        else P2Score()
    }

  /**
   *
   * @param point
   * @return
   */
  def equal(point: Int) : String = {
    if(point < 3) lowEqual(point)
    else if(point>=3) "Deuce"
    else throw new Exception("score not in range of valid values")
  }

  /**
   *
   * @param point
   * @return
   */
    def lowEqual(point : Int) : String = {
      if (P1point==0) "Love-All"
      else if (P1point==1) "Fifteen-All"
      else if (P1point==2) "Thirty-All"
      else throw new Exception("score not in range of valid values")

    }

  /**
   *
   * @param point
   * @param playerName
   * @return
   */
  def scoringLove(point : Int, playerName : String) : String = {
    if(playerName == player2Name) "Love" + "-" + scoring(point)
    else scoring(point) + "-" + "Love"
  }

  /**
   *
   * @param point
   * @return
   */
  def scoring(point : Int) : String = {
    println(point)
    if (point==1) "Fifteen"
    else if (point==2) "Thirty"
    else if (point==3) "Forty"
    else throw new Exception("score not in range of valid values")
  }
}