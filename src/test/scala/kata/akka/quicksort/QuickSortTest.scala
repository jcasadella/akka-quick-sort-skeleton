package kata.akka.quicksort

import akka.actor.{ActorSystem, Props}
import akka.testkit.{TestKit, TestProbe}
import org.scalatest.{BeforeAndAfterAll, WordSpecLike}

import scala.concurrent.duration._

class QuickSortTest extends TestKit(ActorSystem("QuickSortTest")) with WordSpecLike with BeforeAndAfterAll {

  override protected def afterAll(): scala.Unit = {
    system.shutdown()
  }

  "An actor sorter" should {
    "receive a message" in {

      val randomList = scala.util.Random.shuffle(1 to 5).toList
      val probe = TestProbe()

      // Example usage: probe.expectMsg(1.seconds, MyMessage("Hello"))
    }
  }
}
