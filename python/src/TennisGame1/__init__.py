from abc import ABC, abstractmethod


class Scoring(ABC):
    # def __init__(self):
    #     super().__init__()

    @abstractmethod
    def compute_score(self):
        pass
