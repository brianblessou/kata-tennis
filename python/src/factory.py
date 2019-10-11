from tennis1 import handle_equality, get_result, get_mixed_result
from abc import ABC, abstractmethod

class Creator(ABC):
    """   The Creator class declares the factory method that is supposed to return an
        object of a Product class. The Creator's subclasses usually provide the
        implementation of this method.   """
    
    def __init__(self, player1Name, player2Name):
        self.player1Name = player1Name
        self.player2Name = player2Name
        self.p1points = 0
        self.p2points = 0
        super.__init__()

    @abstractmethod
    def score(self):
        pass

class mixedResult(Creator):
    """Return the score string in the case where the score of the players are different and inferior to 40."""  
    def score(self):
        dic = {
        0 : "Love",
        1 : "Fifteen",
        2 : "Thirty",
        3 : "Forty",
        }
        return dic[self.p1points] + "-" + dic[self.p2points]

class equality(Creator):
    """Return the score string in the case where the score of the players are different and inferior to 40."""  
    def score(self):

        result = {
        0 : "Love-All",
        1 : "Fifteen-All",
        2 : "Thirty-All",}.get(self.p1points, "Deuce")
        return result

class getAdvantageResult(Creator):
    """Handle the advantage."""
    def score(self):

        minusResult = self.p1points-self.p2points
        if (minusResult==1):
            return "Advantage " + self.player1Name
        elif (minusResult ==-1):
            return "Advantage " + self.player2Name
        elif (minusResult>=2):
            return "Win for " + self.player1Name
        else:
            return "Win for " + self.player2Name