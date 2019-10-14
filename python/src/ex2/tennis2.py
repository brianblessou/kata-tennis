# -*- coding: utf-8 -*-



class TennisGame2:
    def __init__(self, player1Name, player2Name):
        self.player1Name = player1Name
        self.player2Name = player2Name
        self.p1points = 0
        self.p2points = 0
        
    def won_point(self, playerName):
        if playerName == self.player1Name:
            self.p1points+=1
        else:
            self.p2points+=1
    
    
    
    def score(self):
        # Equality case
        if (self.p1points == self.p2points and self.p1points < 3):
            return self._eqality_score()
        if (self.p1points==self.p2points and self.p1points>2):
            return "Deuce"
        
        # Mix score case
        if (self.p1points < 4 and self.p2points < 4):
            return self._mix_score()
        
        # Advantage or Win case
        return self._advantage_score()
        
    def _eqality_score(self):
        """
        Pre : p1points == p2points
        
        Return : Actual Score (String)
        """
        return {
                    0 : "Love",
                    1 : "Fifteen",
                    2 : "Thirty",
                }[self.p1points]+"-All"
        
    def _mix_score(self):
        """
        Pre : (p1points and p2points <=4) and p1points != p2points
        
        Return : Mix score like "Love-Fifteen" (String)
        """
        score_state = {
                    0 : "Love",
                    1 : "Fifteen",
                    2 : "Thirty",
                    3 : "Forty"
                }
        P1res = score_state[self.p1points]
        P2res = score_state[self.p2points]
        return P1res + "-" + P2res
    
    def _advantage_score(self):
        """
        Pre : (p1points and p2points >=4) 
        
        Return Actual Score (Advantage or Win) (String)
        """
        if(self._diff_points() > 1):
            return "Win for " + self._lead_player_name()
        else :
            return "Advantage " + self._lead_player_name()
             
    
    def _diff_points(self):
        """
        Return : Positif Diff between the two player's point (int)
        """
        diff_points = self.p1points - self.p2points
        if (diff_points > 0):
            return diff_points
        else :
            return -diff_points
        
    def _lead_player_name(self):
        """
        Return : Name player with the more point (int)
        """
        if (self.p1points > self.p2points):
            return self.player1Name
        else:
            return self.player2Name
        
    
        
