import fi.jawsy.sbtplugins.vaadin.VaadinPlugin
import sbt._

class LiftProject(info: ProjectInfo) extends DefaultWebProject(info)  with VaadinPlugin {
  val liftVersion = "2.0"

  override def vaadinWidgetSet = "mypackage.MyWidgetSet"

  override def libraryDependencies = Set(
    "net.liftweb" % "lift-webkit" % liftVersion % "compile->default",
    "net.liftweb" % "lift-mapper" % liftVersion % "compile->default",
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
    "junit" % "junit" % "4.5" % "test->default",
    "org.scala-tools.testing" % "specs" % "1.6.2.1" % "test->default",
    "com.h2database" % "h2" % "1.2.138",
    "com.google.gwt" % "gwt-dev" % "2.1.0",
    "com.google.gwt" % "gwt-user" % "2.1.0" 

  ) ++ super.libraryDependencies
}
