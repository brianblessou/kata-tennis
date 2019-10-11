from python.src.TennisGame3 import Scorer


class ReturnDeuce(Scorer):
    def __init__(self, game: object):
        """
        Scorer class that computes score when points are lower than 4
        :param game: object instance of TennisGame3 of which to compute the score (object)
        """
        self.pointsPlayer1 = game.pointsPlayer1
        self.pointsPlayer2 = game.pointsPlayer2

    def compute_score(self) -> str:
        """
        Compute score when both players have scores lower than 4, except when 3-3
        :return: Actual score (str)
        """
        return 'Deuce'
