# -*- coding: utf-8 -*-


class TennisGame3:
    def __init__(self, player1Name, player2Name):
        self.player1Name = player1Name
        self.player2Name = player2Name
        self.pointsPlayer1 = 0
        self.pointsPlayer2 = 0

    def won_point(self, winner_name):
        if winner_name == self.player1Name:
            self.pointsPlayer1 += 1
        else:
            self.pointsPlayer2 += 1

    def score(self):
        if (self.pointsPlayer1 == self.pointsPlayer2) and (self.pointsPlayer1 >= 3):
            return "Deuce"
        elif self.pointsPlayer1 < 4 and self.pointsPlayer2 < 4:
            points_list = ["Love", "Fifteen", "Thirty", "Forty"]
            player1_score = points_list[self.pointsPlayer1]
            if self.pointsPlayer1 == self.pointsPlayer2:
                return player1_score + "-All"
            else:
                return player1_score + "-" + points_list[self.pointsPlayer2]
        else:
            if self.pointsPlayer1 > self.pointsPlayer2:
                winner_name = self.player1Name
            else:
                winner_name = self.player2Name
            if abs(self.pointsPlayer1 - self.pointsPlayer2) == 1:
                return "Advantage " + winner_name
            else:
                return "Win for " + winner_name
