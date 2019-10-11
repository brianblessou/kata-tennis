# -*- coding: utf-8 -*-

class TennisGame1:

    def __init__(self, player1Name, player2Name):
        self.player1Name = player1Name
        self.player2Name = player2Name
        self.p1points = 0
        self.p2points = 0

    def won_point(self, playerName):
        if playerName == self.player1Name:
            self.p1points += 1
        else:
            self.p2points += 1

    def equal_score(self):
        return {
            0: "Love-All",
            1: "Fifteen-All",
            2: "Thirty-All",
            }.get(self.p1points, "Deuce")

    def score_more_than_4(self):
        minusResult = self.p1points - self.p2points
        if minusResult == 1:
            result = "Advantage " + self.player1Name
        elif minusResult == -1:
            result = "Advantage " + self.player2Name
        elif minusResult >= 2:
            result = "Win for " + self.player1Name
        else:
            result = "Win for " + self.player2Name
        return result

    def diff_score(self):
        score_str_dico = {
                0: "Love",
                1: "Fifteen",
                2: "Thirty",
                3: "Forty",
            }
        return "-".join(map(score_str_dico.get, [self.p1points, self.p2points]))

    def score(self):
        if (self.p1points == self.p2points):
            return self.equal_score()
        elif (self.p1points >= 4 or self.p2points >= 4):
            return self.score_more_than_4()
        else:
            return self.diff_score()
