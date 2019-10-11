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
            scorer = EqualScore(self.p1points)
        elif self.p1points >= 4 or self.p2points >= 4:
            scorer = ScoreMoreThan4(self.player1Name, self.player2Name, self.p1points, self.p2points)
        else:
            scorer = DiffScore(self.p1points, self.p2points)
        return scorer.compute_score()


