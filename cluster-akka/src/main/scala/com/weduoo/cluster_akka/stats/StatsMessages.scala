package com.weduoo.cluster_akka.stats

final case class StatsJob(text: String)
final case class StatsResult(meanWordLength: Double)
final case class JobFailed(reason: String)
