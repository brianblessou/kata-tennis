package tennis.exceptions

final case class UnknownPlayerException(private val playerName: String = "")
  extends Exception(f"Player $playerName%s is not known")
