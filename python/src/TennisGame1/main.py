from python.src.TennisGame1.score_more_than_4 import ScoreMoreThan4
from python.src.TennisGame1.diff_score import DiffScore
from python.src.TennisGame1.equal_score import EqualScore


class TennisGame1:

    def __init__(self, player1Name, player2Name):
        self.player1Name = player1Name
        self.player2Name = player2Name
        self.p1points = 0
        self.p2points = 0

    def won_point(self, playerName):
        if playerName == self.player1Name:
            self.p1points += 1
        else:
            self.p2points += 1

    def score(self):
        if self.p1points == self.p2points:
            eq = EqualScore(self.p1points)
            return eq.compute_score()
        elif self.p1points >= 4 or self.p2points >= 4:
            smt = ScoreMoreThan4(self.player1Name, self.player2Name, self.p1points, self.p2points)
            return smt.compute_score()
        else:
            diff = DiffScore(self.p1points, self.p2points)
            return diff.compute_score()


