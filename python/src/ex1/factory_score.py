from src.ex1.score import EqualScore, AdvantageScore, MixScore
from abc import ABC, abstractmethod


class AbstractFactoryScore(ABC):
    def __init__(self, tennisGame):
        self.tennisGame = tennisGame
        super().__init__()
    
    @abstractmethod
    def product(self):
        pass
    
class FactoryScore(AbstractFactoryScore):
    def product(self):
        if (self.tennisGame.p1points==self.tennisGame.p2points):
            return EqualScore(self.tennisGame)
            
        elif (self.tennisGame.p1points>=4 or self.tennisGame.p2points>=4):
            return AdvantageScore(self.tennisGame)
            
        else:
            return MixScore(self.tennisGame)
        

        