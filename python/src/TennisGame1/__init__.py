from abc import ABC, abstractmethod


class Scoring(ABC):

    @abstractmethod
    def compute_score(self):
        pass
