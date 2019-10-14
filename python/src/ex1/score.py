from abc import ABC, abstractmethod
 
class AbstractScore(ABC):
    def __init__(self, tennisGame):
        self.p1points = tennisGame.p1points
        self.p2points = tennisGame.p2points
        self.player1Name = tennisGame.player1Name
        self.player2Name = tennisGame.player2Name
        super().__init__()
    
    @abstractmethod
    def score(self):
        pass
    
class EqualScore(AbstractScore):
    """ Calculate score for an equality """
    
    def score(self):
        """
        Pre : p1points == p2points
        
        Return : Actual Score (String)
        """
        return {
                0 : "Love-All",
                1 : "Fifteen-All",
                2 : "Thirty-All",
            }.get(self.p1points, "Deuce")

class AdvantageScore(AbstractScore):
    """ Calculate score for an Advantage or a Win """
    def score(self):
        """
        Pre : (p1points and p2points >=4) 
        
        Return Actual Score (Advantage or Win) (String)
        """
        minusResult = self.p1points-self.p2points
        if (minusResult==1):
            return "Advantage " + self.player1Name
        elif (minusResult ==-1):
            return "Advantage " + self.player2Name
        elif (minusResult>=2):
            return  "Win for " + self.player1Name
        else:
            return "Win for " + self.player2Name
        
    
    
class MixScore(AbstractScore):
    """ Calculate score for a Score under 4 """
    def score(self):
        """
        Pre : (p1points and p2points <=4) and p1points != p2points
        
        Return : Mix score like "Love-Fifteen" (String)
        """
        dic_score = {
                    0 : "Love",
                    1 : "Fifteen",
                    2 : "Thirty",
                    3 : "Forty",
                }
        return dic_score[self.p1points] + "-" + dic_score[self.p2points]      

    
             