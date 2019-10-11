from abc import ABC, abstractmethod


class Scorer(ABC):
    def __init__(self, game):
        self.game = game
        super().__init__()

    @abstractmethod
    def compute_score(self):
        pass