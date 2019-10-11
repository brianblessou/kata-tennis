package tennis



class TennisGame2 (val player1Name : String, val player2Name : String) extends TennisGame {

    private var P1point = 0
    private var P2point  = 0

    private var P1res = ""
    private var P2res = ""

    def calculateScore() : String = {
        var score = ""
        if (P1point == P2point) {
          if(P1point < 3) score = lowEqual(P1point)
          else if(P1point>=3) score = "Deuce"
          else throw new Exception("score not in range of valid values")
        }else if (P1point > 0 && P2point==0)
        {
          score = love(P1point, player1Name)
        }else if (P2point > 0 && P1point==0)
        {
          score = love(P2point, player2Name)
        }else if (P1point>P2point && P1point < 4)
        {
            if (P1point==2)
                P1res="Thirty"
            if (P1point==3)
                P1res="Forty"
            if (P2point==1)
                P2res="Fifteen"
            if (P2point==2)
                P2res="Thirty"
            score = P1res + "-" + P2res
        }else if (P2point>P1point && P2point < 4)
        {
            if (P2point==2)
                P2res="Thirty"
            if (P2point==3)
                P2res="Forty"
            if (P1point==1)
                P1res="Fifteen"
            if (P1point==2)
                P1res="Thirty"
            score = P1res + "-" + P2res
        }else if (P1point > P2point && P2point >= 3)
        {
            score = "Advantage player1"
        }else if (P2point > P1point && P1point >= 3)
        {
            score = "Advantage player2"
        }else if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
            score = "Win for player1"
        }else if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
            score = "Win for player2"
        }
        return score
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

    def P2Score(){
        P2point +=1
    }

    def wonPoint(player : String) {
        if (player == "player1")
            P1Score()
        else
            P2Score()
    }

    def lowEqual(point : Int) : String = {
      var score = ""
      if (P1point==0)
        score = "Love"
      if (P1point==1)
        score = "Fifteen"
      if (P1point==2)
        score = "Thirty"
      score += "-All"
      score
    }

  /**
   *
   * @param point
   * @param playerName
   * @return
   */
  def love(point : Int, playerName : String) : String = {
    var res = ""
    if (point==1)
      res = "Fifteen"
    if (point==2)
      res = "Thirty"
    if (point==3)
      res = "Forty"

    if(playerName == player1Name){
      res += "Love" + "-" + res
    } else {
      res += res + "-" + "Love"
    }
    res
  }
}