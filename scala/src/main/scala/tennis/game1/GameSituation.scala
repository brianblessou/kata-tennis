package tennis.game1

trait GameSituation {

  /**
   * Trait for the different game situations
   * @param points1 points of first player
   * @param points2 points of seconds player
   * @return Score label
   */
  def score(points1: Int, points2: Int) : String
}
