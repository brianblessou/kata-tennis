from python.src.TennisGame3 import Factory
from python.src.TennisGame3.points_lower_than_4 import PointsLowerThan4
from python.src.TennisGame3.points_bigger_than_4 import PointsBiggerThan4
from python.src.TennisGame3.return_deuce import ReturnDeuce


class ScoreCreator(Factory):
    def __init__(self, game):
        """
        Class of Factories that create Scorers
        :param game: object of TennisGame3 class
        """
        self.game = game
        self.pointsPlayer1 = game.pointsPlayer1
        self.pointsPlayer2 = game.pointsPlayer2

    def create(self):
        if (self.pointsPlayer1 == self.pointsPlayer2) and (self.pointsPlayer1 >= 3):
            return ReturnDeuce(self.game)
        elif self.pointsPlayer1 < 4 and self.pointsPlayer2 < 4:
            return PointsLowerThan4(self.game)
        else:
            return PointsBiggerThan4(self.game)

