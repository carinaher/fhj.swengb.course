package fhj.swengb.lectures.l03

import java.net.URL
import java.util.ResourceBundle
import javafx.application.Application
import javafx.fxml.{FXMLLoader, Initializable}
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage

import scala.util.control.NonFatal

/**
  * A simple hello world example application
  * for JavaFX.
  */
object JavaFxHelloworld {
  def main(args: Array[String]) {
    Application.launch(classOf[JavaFxHelloworld], args: _*)
  }
}

class JavaFxHelloworld extends javafx.application.Application {

  val Fxml = "/fhj/swengb/lectures/l03/Helloworld.fxml"
  val Css = "fhj/swengb/lectures/l03/buttonstyles.css"

  val loader = new FXMLLoader(getClass.getResource(Fxml))

  override def start(stage: Stage): Unit =
    try {
      stage.setTitle("Helloworld")
      loader.load[Parent]() // side effect
      val scene = new Scene(loader.getRoot[Parent])
      stage.setScene(scene)
      stage.getScene.getStylesheets.add(Css)
      stage.show()
    } catch {
      case NonFatal(e) => e.printStackTrace()
    }

}


class HelloworldController extends Initializable {

  override def initialize(location: URL, resources: ResourceBundle): Unit = {

  }

  def clicked(): Unit = {
    println("clicked")
  }

  def click1(): Unit = {
    println("1")
  }

  def click2(): Unit = {
    println("2")
  }

  def click3(): Unit = {
    println("3")
  }
  def click4(): Unit = {
    println("4")
  }
  def click5(): Unit = {
    println("5")
  }
  def click6(): Unit = {
    println("6")
  }
  def click7(): Unit = {
    println("7")
  }
  def click8(): Unit = {
    println("8")
  }
  def click9(): Unit = {
    println("9")
  }
}