package com.weduoo.cluster_akka.transformation

object TransformationApp {

  def main(args: Array[String]): Unit = {
    // starting 2 frontend nodes and 3 backend nodes
    TransformationFrontend.main(Seq("2551").toArray)
    TransformationFrontend.main(Array.empty)
    TransformationBackend.main(Seq("2552").toArray)
    TransformationBackend.main(Array.empty)
    TransformationBackend.main(Array.empty)
  }

}