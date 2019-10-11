class TennisGame3:
    def __init__(self, player1Name, player2Name):
        self.p1N = player1Name
        self.p2N = player2Name
        self.p1 = 0
        self.p2 = 0
        
    def won_point(self, n):
        if n == self.p1N:
            self.p1 += 1
        else:
            self.p2 += 1
    
    def score(self):
        if (self.p1 < 4 and self.p2 < 4) and (self.p1 + self.p2 < 6):
            labels = ["Love", "Fifteen", "Thirty", "Forty"]
            return concatenate_scores(labels)
        else:
            if (self.p1 == self.p2):
                return "Deuce"
            return compute_advance_or_winner()



    def concatenate_scores(self,labels):
        p1_score = labels[self.p1]
        p2_score = labels[self.p2]
        return p1_score + "-All" if (self.p1 == self.p2) else p1_score + "-" + labels[self.p2]

    def compute_advance_or_winner(self,):
        player_name = self.p1N if self.p1 > self.p2 else self.p2N
        if ((self.p1-self.p2)**2 == 1):
            return "Advantage " + player_name 
        else:
            return "Win for " + player_name
