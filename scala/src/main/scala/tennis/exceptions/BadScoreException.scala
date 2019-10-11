package tennis.exceptions

final case class BadScoreException(private val message: String = "",
                                   private val cause: Throwable = None.orNull)
  extends Exception(message, cause)
