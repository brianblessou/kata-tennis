# -*- coding: utf-8 -*-


        
class TennisGame3:
    def __init__(self, player1Name, player2Name):
        self.player1Name = player1Name
        self.player2Name = player2Name
        self.player1Point = 0
        self.player2Point = 0
        
    def won_point(self, winnerName):
        """ Add 1 to winnerName's score """
        if winnerName == self.player1Name:
            self.player1Point += 1
        else:
            self.player2Point += 1
    
    def score(self):
        """ Return : Actual Score """
        
        if (self.player1Point < 4 and self.player2Point < 4) and (self.player1Point + self.player2Point < 6):
            score_type = ["Love", "Fifteen", "Thirty", "Forty"]
            scorePlayer1 = score_type[self.player1Point]
            if (self.player1Point == self.player2Point):
                # Equality Score when player score < 4
                return  scorePlayer1 + "-All"
            else :
                # Mix Score
                return scorePlayer1 + "-" + score_type[self.player2Point]
        else:
            # Equality Score when player score >= 4
            if (self.player1Point == self.player2Point):
                return "Deuce"
            
            # Win or Advantage Score
            scorePlayerLead = self.player1Name if self.player1Point > self.player2Point else self.player2Name
            diffPoint = self.player1Point-self.player2Point
            
            if (diffPoint == 1 or diffPoint == -1):
                return "Advantage " + scorePlayerLead
            else :
                return "Win for " + scorePlayerLead
