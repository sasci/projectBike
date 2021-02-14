pipeline{
    agent any
    stages{
        stage ("run test") {
          steps {
            echo 'executing maven...'
            withGradle(){
              sh './mvnw clean test'
            }
          }
        }

        stage ('Cucumber Reports') {
              steps {
                    cucumber buildStatus:'UNSTABLE',
                    fileIncludePattern:'**/cucumber.json',
                    jsonReportDirectory:'target'

              }
        }

    }
}