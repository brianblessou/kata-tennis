import unittest

from python.src.TennisGame3 import TennisGame3
from python.test import play_game, test_cases


class TestTennis3(unittest.TestCase):

    def test_Score_Game3(self):
        for testcase in test_cases:
            (p1Points, p2Points, score, p1Name, p2Name) = testcase
            game = play_game(TennisGame3, p1Points, p2Points, p1Name, p2Name)
            self.assertEqual(score, game.score())

if __name__ == "__main__":
    unittest.main()
