node {
   stage('Build') {
      // Run the Taurus build
   }
   stage('Performance Tests') {
    parallel(
         BlazeMeterTest: {
            dir ('C:\\Users\\LakshmiNarayanaRaoCh\\AppData\\Local\\Programs\\Python\\Python311\\Scripts') {
               bat 'bzt Tokenscript.jmx.yaml -report'
            }
        },
        Analysis: {
            sleep 60
        })
   }

   stage('Deploy') {
   }
}