from abc import ABC, abstractmethod


class Scorer(ABC):
    def __init__(self, game: object):
        """
        ABC class to compute scores
        :param game: object of TennisGame3 class
        """
        self.game = game
        super().__init__()

    @abstractmethod
    def compute_score(self):
        pass


class Factory(ABC):
    def __init__(self, game):
        """
       ABC class for Factories that create Scorers
       :param game: object of TennisGame3 class
       """
        self.game = game
        super().__init__()

    @abstractmethod
    def create(self):
        pass
