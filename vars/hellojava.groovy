def call(){
		pipeline{
			agent any
			stages{
				stage('checkout')
				{
					steps{
						git "https://github.com/chakreshkolluru/Myrepository.git"					
					}
				}
				stage('build'){
					steps{
						sh "javac sample/Hello.java" 
					}
				}
				stage('run'){
					steps{
						sh "java -cp sample Hello"	
				}
			}
		}
		//echo "This is a file in vars folder"

	}
}