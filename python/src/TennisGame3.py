# -*- coding: utf-8 -*-


class TennisGame3:
    def __init__(self, player1Name, player2Name):
        self.player1Name = player1Name
        self.player2Name = player2Name
        self.pointsPlayer1 = 0
        self.pointsPlayer2 = 0

    def won_point(self, n):
        if n == self.player1Name:
            self.pointsPlayer1 += 1
        else:
            self.pointsPlayer2 += 1

    def score(self):
        if (self.pointsPlayer1 < 4 and self.pointsPlayer2 < 4) and (self.pointsPlayer1 + self.pointsPlayer2 < 6):
            p = ["Love", "Fifteen", "Thirty", "Forty"]
            s = p[self.pointsPlayer1]
            return s + "-All" if (self.pointsPlayer1 == self.pointsPlayer2) else s + "-" + p[self.pointsPlayer2]
        else:
            if self.pointsPlayer1 == self.pointsPlayer2:
                return "Deuce"
            s = self.player1Name if self.pointsPlayer1 > self.pointsPlayer2 else self.player2Name
            return "Advantage " + s if ((self.pointsPlayer1 - self.pointsPlayer2) * (self.pointsPlayer1 - self.pointsPlayer2) == 1) else "Win for " + s
