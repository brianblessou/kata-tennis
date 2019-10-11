from abc import ABC, abstractmethod


class Scoring(ABC):

    @abstractmethod
    def compute_score(self) -> str:
        """
        Computes the score of the game
        :return: string score
        """
        pass
