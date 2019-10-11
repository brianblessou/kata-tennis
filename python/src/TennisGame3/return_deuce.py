from python.src.TennisGame3 import Scorer


class ReturnDeuce(Scorer):
    def __init__(self):
        """
        Scorer class that returns 'Deuce' score
        """

    def compute_score(self) -> str:
        """
        Compute score when both players have same scores bigger than 2
        :return: Actual score (str)
        """
        return 'Deuce'
