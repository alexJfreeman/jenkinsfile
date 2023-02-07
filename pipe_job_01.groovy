pipeline {
    agent any
	stages {
	   stage('My-First-Commands') {
	       steps {
		      echo "First"		   
		   }
	   }
	   stage('My-Second-Commands') {
	       steps {
		      echo "Second"		   
		   }
	   }
	   stage('My-Third-Commands') {
	       steps {
		      echo "Second"		   
		   }
	   }
	}
}