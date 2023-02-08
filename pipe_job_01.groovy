pipeline {
    agent any
	stages {
	   stage('My-First-Commands') {
	       steps {
		      echo "${FRASE}"		   
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