pipeline {
    agent any
	stages {
	   stage('My-First-Commands') {
	       steps {
		      echo "${PAR1}"		   
		   }
	   }
	   stage('My-Second-Commands') {
	       steps {
		      echo "${PAR2}"		   
		   }
	   }
	   stage('My-Third-Commands') {
	       steps {
		      echo "${PAR3}"		   
		   }
	   }
	}
}