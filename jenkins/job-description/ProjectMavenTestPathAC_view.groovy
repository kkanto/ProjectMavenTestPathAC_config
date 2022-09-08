 
listView('ProjectMavenTestPathAC Jobs') {
    description('ProjectMavenTestPathAC Jobs')
    jobs {
        regex('ProjectMavenTestPathAC_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
