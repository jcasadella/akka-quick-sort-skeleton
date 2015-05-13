package kata.akka.quicksort

import akka.actor._
import akka.event.LoggingReceive

import scala.concurrent.duration._

object QuickSort extends App {

  import system.dispatcher

  trait SortMessage

  case class Sort(list: List[Int]) extends SortMessage

  case class Result(sorted: List[Int]) extends SortMessage

  val system = ActorSystem("SortSystem")
  val controller = system.actorOf(Props[Controller], name = "controller")

  class Controller extends Actor {

    override def receive: Receive = LoggingReceive {
      case _ => println("Hello World")
    }
  }

}
