def call(){

	git "https://github.com/chakreshkolluru/chakresh.git"
	sh 'javac sample/Hello.java'

	sh 'java -cp sample Hello'
}