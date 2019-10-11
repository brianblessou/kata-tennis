from python.src.TennisGame1 import Scoring


class DiffScore(Scoring):
    def __init__(self, p1points: int, p2points: int):
        """
        Abstract scoring method for computing score when player 1 and player 2 scores are different
        :param p1points: points of player 1
        :param p2points: points of player 2
        """
        self.p1points = p1points
        self.p2points = p2points

    def compute_score(self):
        """
        Computes score
        :return: score string
        """
        score_str_dico = {
            0: "Love",
            1: "Fifteen",
            2: "Thirty",
            3: "Forty",
        }
        return score_str_dico[self.p1points] + "-" + score_str_dico[self.p2points]