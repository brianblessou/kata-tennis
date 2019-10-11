from python.src.TennisGame3 import Scorer


class PointsBiggerThan4(Scorer):
    def __init__(self, game: object):
        """
        Scorer class that computes score when points are bigger than 4
        :param game: object instance of TennisGame3 of which to compute the score (object)
        """
        self.pointsPlayer1 = game.pointsPlayer1
        self.pointsPlayer2 = game.pointsPlayer2
        self.player1Name = game.player1Name
        self.player2Name = game.player2Name

    def compute_score(self):
        """
        Compute score when score of at least one player is bigger than 4 and scores are not equal
        :return: Actual score (str)
        """
        if self.pointsPlayer1 > self.pointsPlayer2:
            winner_name = self.player1Name
        else:
            winner_name = self.player2Name
        if abs(self.pointsPlayer1 - self.pointsPlayer2) == 1:
            return "Advantage " + winner_name
        else:
            return "Win for " + winner_name
