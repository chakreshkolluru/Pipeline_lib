def call(){
	node{
		stage 'checkout'
		git "https://github.com/chakreshkolluru/Myrepository.git"

		
			stage 'compile'
			sh "javac sample/Hello.java"

			stage 'Run'
			sh "java -cp sample Hello"
		

	}
}