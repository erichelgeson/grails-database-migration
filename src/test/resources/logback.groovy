// See http://logback.qos.ch/manual/groovy.html for details on configuration
def CONSOLE_LOG_PATTERN = '%d{HH:mm:ss.SSS} [%t] %highlight(%p) %cyan(\\(%logger{39}\\)) %m%n'

appender('STDOUT', ConsoleAppender) {
    withJansi = true
    encoder(PatternLayoutEncoder) {
        pattern = CONSOLE_LOG_PATTERN
    }
}

root(WARN, ['STDOUT'])
