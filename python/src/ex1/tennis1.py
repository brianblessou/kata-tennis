# -*- coding: utf-8 -*-

from src.ex1.score import EqualScore, AdvantageScore, MixScore
from src.ex1.factory_score import FactoryScore

class TennisGame1:

    def __init__(self, player1Name, player2Name):
        self.player1Name = player1Name
        self.player2Name = player2Name
        self.p1points = 0
        self.p2points = 0
        
    def won_point(self, playerName):
        """
        Add 1 to the playerName's score
        """
        if(playerName in [self.player1Name, self.player2Name]):
            if playerName == self.player1Name:
                self.p1points += 1
            else:
                self.p2points += 1
                
        else : 
            raise Exception("It's not a real playerName")
            
    def score(self):
        """
        Return : Actual Score (String)
        """
    
        return FactoryScore(self).product().score()
        
        


