from python.src.TennisGame1 import Scoring


class DiffScore(Scoring):
    def __init__(self, p1points, p2points):
        self.p1points = p1points
        self.p2points = p2points

    def compute_score(self):
        score_str_dico = {
            0: "Love",
            1: "Fifteen",
            2: "Thirty",
            3: "Forty",
        }
        return score_str_dico[self.p1points] + "-" + score_str_dico[self.p2points]