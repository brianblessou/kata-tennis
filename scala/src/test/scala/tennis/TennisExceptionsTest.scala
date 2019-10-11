package tennis

import org.junit.Test
import tennis.exceptions.UnknownPlayerException
import tennis.game3.TennisGame3

class TennisExceptionsTest() {

  @Test(expected = classOf[UnknownPlayerException])
  def checkTennisGame3BadPlayer() {
    val game = new TennisGame3("player1", "player2")
    game.wonPoint("badPlayerName")
  }
}


