rootProject.name = "crypto-backed-loans"

//include("batch")
include("domain")

include("app")

include("app:application")
findProject(":app:application")?.name = "application"

include("app:infrastructure")
findProject(":app:infrastructure")?.name = "infrastructure"



include("batch")

include("batch:application")
findProject(":batch:application")?.name = "application"

include("batch:infrastructure")
findProject(":batch:infrastructure")?.name = "infrastructure"
