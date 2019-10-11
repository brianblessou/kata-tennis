package tennis.game1

class GameSituationFactory (val p1Points: Int, val p2Points: Int) {
  def create(): GameSituation = {
    if (p1Points == p2Points) SamePointsSituation
    else if (p1Points >= 4 || p2Points >= 4) EndGameSituation
    else RegularSituation
  }
}
