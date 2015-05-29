package kata.akka.quicksort

import akka.actor._
import akka.event.LoggingReceive

import scala.concurrent.duration._

object QuickSort extends App {

  val system = ActorSystem("SortSystem")
  val controller = system.actorOf(Props[Controller], name = "controller")

  class Controller extends Actor {

    override def receive: Receive = LoggingReceive {
      case _ => println("Hello World")
    }
  }

}
