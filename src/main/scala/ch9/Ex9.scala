package ch9

import java.nio.file.{FileVisitOption, Files, Paths}

object Ex9 extends App {
  println(Files.walk(Paths.get("")).filter(_.toString.endsWith(".class")).count)
}
