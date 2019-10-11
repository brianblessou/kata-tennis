import unittest

from python.src.TennisGame1.main import TennisGame1
from python.test import play_game, test_cases


class TestTennis1(unittest.TestCase):

    def test_Score_Game1(self):
        for testcase in test_cases:
            (p1Points, p2Points, score, p1Name, p2Name) = testcase
            game = play_game(TennisGame1, p1Points, p2Points, p1Name, p2Name)
            self.assertEqual(score, game.score())


if __name__ == "__main__":
    unittest.main()


