rootProject.name = "crypto-backed-loans"

include("batch")
include("domain")
include("shared")

include("app")

include("app:client")
findProject(":app:client")?.name = "client"