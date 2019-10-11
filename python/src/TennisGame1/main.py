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
        scorer = Factory(self.player1Name, self.player2Name, self.p1points, self.p2points).create_scorer()
        return scorer.compute_score()


class Factory:
    def __init__(self, player1Name, player2Name, p1points, p2points):
        self.player1Name = player1Name
        self.player2Name = player2Name
        self.p1points = p1points
        self.p2points = p2points

    def create_scorer(self):
        if self.p1points == self.p2points:
            return EqualScore(self.p1points)
        elif self.p1points >= 4 or self.p2points >= 4:
            return ScoreMoreThan4(self.player1Name, self.player2Name, self.p1points, self.p2points)
        else:
            return DiffScore(self.p1points, self.p2points)
