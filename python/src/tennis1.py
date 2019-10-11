# -*- coding: utf-8 -*-


from factory import Creator
class TennisGame1:
    """ Compute, save and record the score of a tennis game."""

    def won_point(self, playerName):
        """Update the point of the players after each point played."""
        if playerName == self.player1Name:
            self.p1points += 1
        else:
            self.p2points += 1
    mycreator = Creator()
    if (mycreator.p1points==mycreator.p2points):
        result = mycreator.equality.score()
    elif (mycreator.p1points>=4 or mycreator.p2points>=4):
        result = mycreator.getAdvantageResult.score()
    else:
        result = mycreator.mixedResult.score()
    return result
