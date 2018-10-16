def call(){

	

	git "https://github.com/chakreshkolluru/chakresh.git"
	
	//echo "${s}"

	sh 'javac sample/Hello.java'

	sh 'java -cp sample Hello'
}