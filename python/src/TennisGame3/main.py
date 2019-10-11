# -*- coding: utf-8 -*-
from python.src.TennisGame3.score_creator import ScoreCreator


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
        return ScoreCreator(self).create().compute_score()
