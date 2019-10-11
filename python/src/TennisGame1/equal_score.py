from python.src.TennisGame1 import Scoring


class EqualScore(Scoring):
    def __init__(self, p1points):
        self.p1points = p1points

    def compute_score(self):
        return {
            0: "Love-All",
            1: "Fifteen-All",
            2: "Thirty-All",
        }.get(self.p1points, "Deuce")