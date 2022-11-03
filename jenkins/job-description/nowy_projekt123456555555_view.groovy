 
listView('nowy_projekt123456555555 Jobs') {
    description('nowy_projekt123456555555 Jobs')
    jobs {
        regex('nowy_projekt123456555555_.+')
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
