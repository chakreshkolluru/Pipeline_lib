def call(){
	node{
		stage 'checkout'
		git "https://github.com/chakreshkolluru/Myrepository.git"

		dir('sample'){
			stage 'compile'
			sh "javac Hello.java"

			stage 'Run'
			sh "java Hello"
		}

		post{
			success{
				echo "----Library is Successfully Imported----"
				echo "Build is success"
			}
		}
	}
}