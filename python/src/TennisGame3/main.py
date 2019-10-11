# -*- coding: utf-8 -*-
from python.src.TennisGame3.points_lower_than_4 import PointsLowerThan4
from python.src.TennisGame3.points_bigger_than_4 import PointsBiggerThan4

class TennisGame3:
    def __init__(self, player1Name: str, player2Name: str):
        """
        Creates a object to track events in the Tennis Game
        :param player1Name: name of first player (str)
        :param player2Name: name of second player (str)
        """
        self.player1Name = player1Name
        self.player2Name = player2Name
        self.pointsPlayer1 = 0
        self.pointsPlayer2 = 0

    def won_point(self, winner_name: str):
        """
        Add points to the winner of the point
        :param winner_name: name of the player that just won the point (str)
        :return: None, will add 1 point to the winner_name
        """
        if winner_name == self.player1Name:
            self.pointsPlayer1 += 1
        else:
            self.pointsPlayer2 += 1



    def score(self) -> str:
        """
        Computes for different case the score of the game
        :return: Actual score (str)
        """
        if (self.pointsPlayer1 == self.pointsPlayer2) and (self.pointsPlayer1 >= 3):
            return "Deuce"
        elif self.pointsPlayer1 < 4 and self.pointsPlayer2 < 4:
            return PointsLowerThan4(self).compute_score()
        else:
            return PointsBiggerThan4(self).compute_score()
