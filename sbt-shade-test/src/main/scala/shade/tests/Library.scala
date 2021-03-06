package shade.tests

import java.lang
import java.util.concurrent.CompletionStage

import cats.Monoid
import org.neo4j.driver.v1.{AccessMode, Driver, Session}

class Library extends Monoid[Library]{

  def someLibraryMethod(): Boolean = true

  val myMonoid = new Monoid[Library]() {
    override def empty: Library = ???

    override def combine(x: Library, y: Library): Library = ???
  }

  override def empty: Library = ???

  override def combine(x: Library, y: Library): Library = ???
}

class MyDriver extends Driver {
  override def isEncrypted: Boolean = ???

  override def session(): Session = ???

  override def session(mode: AccessMode): Session = ???

  override def session(bookmark: String): Session = ???

  override def session(mode: AccessMode, bookmark: String): Session = ???

  override def session(bookmarks: lang.Iterable[String]): Session = ???

  override def session(mode: AccessMode, bookmarks: lang.Iterable[String]): Session = ???

  override def close(): Unit = ???

  override def closeAsync(): CompletionStage[Void] = ???
}
