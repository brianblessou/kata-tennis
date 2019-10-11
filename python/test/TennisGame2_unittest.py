import unittest

from python.src.TennisGame2 import TennisGame2
from python.test import play_game, test_cases


class TestTennis2(unittest.TestCase):

    def test_Score_Game2(self):
        for testcase in test_cases:
            (p1Points, p2Points, score, p1Name, p2Name) = testcase
            game = play_game(TennisGame2, p1Points, p2Points, p1Name, p2Name)
            self.assertEqual(score, game.score())

if __name__ == "__main__":
    unittest.main()
