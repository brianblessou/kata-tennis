from python.src.TennisGame1 import Scoring


class ScoreMoreThan4(Scoring):
    def __init__(self, player1Name, player2Name, p1points, p2points):
        self.player1Name = player1Name
        self.player2Name = player2Name
        self.p1points = p1points
        self.p2points = p2points

    def compute_score(self):
        minusResult = self.p1points - self.p2points
        if minusResult == 1:
            return "Advantage " + self.player1Name
        elif minusResult == -1:
            return "Advantage " + self.player2Name
        elif minusResult >= 2:
            return "Win for " + self.player1Name
        else:
            return "Win for " + self.player2Name
